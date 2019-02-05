package com.lbs.re.data.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.ResourceitemDAO;
import com.lbs.re.data.repository.ResourceitemRepository;
import com.lbs.re.model.ReResourceitem;
import com.lbs.re.model.ReStandard;
import com.lbs.re.model.languages.ReEnglishus;
import com.lbs.re.model.languages.ReTurkishtr;
import com.lbs.re.util.LogoResConstants;

@Component
public class ResourceitemDAOImpl extends BaseDAOImpl<ReResourceitem, Integer> implements ResourceitemDAO {
	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private transient ResourceitemRepository repository;

	private DataSource dataSource;

	@PersistenceContext
	protected EntityManager em;

	@Autowired
	public void setRepository(ResourceitemRepository repository, DataSource dataSource) {
		this.repository = repository;
		this.dataSource = dataSource;
		super.setRepository(repository);
	}

	@Override
	public List<ReResourceitem> getItemListByResource(int resourceref) {
		return repository.findByresourceref(resourceref);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<ReResourceitem> getLastModifiedItemList() {
		Criteria criteriaResourceItem = em.unwrap(Session.class).createCriteria(ReResourceitem.class);
		criteriaResourceItem.addOrder(Order.desc("modifiedon"));
		criteriaResourceItem.setMaxResults(100);
		return criteriaResourceItem.list();
	}

	@Override
	@Transactional
	public List<ReResourceitem> getAdvancedSearchedItemList(List<Criterion> resourceItemCriterias, List<Criterion> turkishCriterias, List<Criterion> englishCriterias,
			List<Criterion> standardCriterias) {
		List<ReResourceitem> itemList = generateResourceItemListByCriterias(resourceItemCriterias, turkishCriterias, englishCriterias, standardCriterias);
		return itemList;
	}

	private List<ReResourceitem> generateResourceItemListByCriterias(List<Criterion> resourceItemCriterias, List<Criterion> turkishCriterias, List<Criterion> englishCriterias,
			List<Criterion> standardCriterias) {
		Criteria criteriaResourceItem = em.unwrap(Session.class).createCriteria(ReResourceitem.class)
				.setProjection(Projections.projectionList().add(Projections.property("id"), "id"));
		criteriaResourceItem.createAlias("resourceAtom", "resource");
		for (Criterion criterion : resourceItemCriterias) {
			criteriaResourceItem.add(criterion);
		}
		List<Integer> itemIdList = new ArrayList<>();
		ScrollableResults scroll = criteriaResourceItem.setReadOnly(true).scroll(ScrollMode.FORWARD_ONLY);
		while (scroll.next()) {
			Integer itemId = (Integer) scroll.get()[0];
			itemIdList.add(itemId);
		}
		if (!itemIdList.isEmpty()) {
			if (!turkishCriterias.isEmpty()) {
				itemIdList = generateTurkishItemList(itemIdList, turkishCriterias);
				if (itemIdList.isEmpty()) {
					return new ArrayList<ReResourceitem>();
				}
			}
			if (!englishCriterias.isEmpty()) {
				itemIdList = generateEnglishItemList(itemIdList, englishCriterias);
				if (itemIdList.isEmpty()) {
					return new ArrayList<ReResourceitem>();
				}
			}
			if (!standardCriterias.isEmpty()) {
				itemIdList = generateStandardItemList(itemIdList, standardCriterias);
				if (itemIdList.isEmpty()) {
					return new ArrayList<ReResourceitem>();
				}
			}
		}

		List<ReResourceitem> refinedList = new ArrayList<>();
		for (Integer value : itemIdList) {
			ReResourceitem newInstance = new ReResourceitem();
			newInstance.setId(value);
			refinedList.add(newInstance);
		}
		return refinedList;
	}

	@SuppressWarnings("unchecked")
	private List<Integer> generateTurkishItemList(List<Integer> itemList, List<Criterion> turkishCriterias) {
		List<Integer> removedItemList = new ArrayList<>();
		boolean isEmpyCriteria = false;
		Criteria criteriaTurkish = em.unwrap(Session.class).createCriteria(ReTurkishtr.class).setProjection(
				Projections.projectionList().add(Projections.property("resourceitemref"), "resourceitemref"));
		for (Criterion criterion : turkishCriterias) {
			if (criterion.toString().contains(LogoResConstants.ISEMPTY_CONTROL)) {
				isEmpyCriteria = true;
			} else {
				criteriaTurkish.add(criterion);
			}
		}
		List<Integer> turkishList = criteriaTurkish.list();
		if (turkishList.isEmpty()) {
			return new ArrayList<>();
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i : turkishList) {
			map.put(i, i);
		}
		Iterator<Integer> itemIterator = itemList.iterator();
		while (itemIterator.hasNext()) {
			Integer reResourceitem = itemIterator.next();
			boolean isFound = false;
			Integer value = map.get(reResourceitem);
			if (value != null) {
				isFound = true;
			}
			if (!isFound) {
				removedItemList.add(reResourceitem);
				itemIterator.remove();
			}
		}
		if (isEmpyCriteria) {
			return removedItemList;
		}
		return itemList;
	}

	@SuppressWarnings("unchecked")
	private List<Integer> generateEnglishItemList(List<Integer> itemList, List<Criterion> englishCriterias) {
		List<Integer> removedItemList = new ArrayList<>();
		boolean isEmpyCriteria = false;
		Criteria criteriaEnglish = em.unwrap(Session.class).createCriteria(ReEnglishus.class).setProjection(
				Projections.projectionList().add(Projections.property("resourceitemref"), "resourceitemref"));
		for (Criterion criterion : englishCriterias) {
			if (criterion.toString().contains(LogoResConstants.ISEMPTY_CONTROL)) {
				isEmpyCriteria = true;
			} else {
				criteriaEnglish.add(criterion);
			}
		}
		List<Integer> englishList = criteriaEnglish.list();
		if (englishList.isEmpty()) {
			return new ArrayList<>();
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i : englishList) {
			map.put(i, i);
		}
		Iterator<Integer> itemIterator = itemList.iterator();
		while (itemIterator.hasNext()) {
			Integer reResourceitem = itemIterator.next();
			boolean isFound = false;
			Integer value = map.get(reResourceitem);
			if (value != null) {
				isFound = true;
			}
			if (!isFound) {
				removedItemList.add(reResourceitem);
				itemIterator.remove();
			}
		}
		if (isEmpyCriteria) {
			return removedItemList;
		}
		return itemList;
	}

	@SuppressWarnings("unchecked")
	private List<Integer> generateStandardItemList(List<Integer> itemList, List<Criterion> standardCriterias) {
		List<Integer> removedItemList = new ArrayList<>();
		boolean isEmpyCriteria = false;
		Criteria criteriaStandrd = em.unwrap(Session.class).createCriteria(ReStandard.class).setProjection(
				Projections.projectionList().add(Projections.property("resourceitemref"), "resourceitemref"));
		for (Criterion criterion : standardCriterias) {
			if (criterion.toString().contains(LogoResConstants.ISEMPTY_CONTROL)) {
				isEmpyCriteria = true;
			} else {
				criteriaStandrd.add(criterion);
			}
		}
		List<Integer> standardList = criteriaStandrd.list();
		if (standardList.isEmpty()) {
			return new ArrayList<>();
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i : standardList) {
			map.put(i, i);
		}
		Iterator<Integer> itemIterator = itemList.iterator();
		while (itemIterator.hasNext()) {
			Integer reResourceitem = itemIterator.next();
			boolean isFound = false;
			Integer value = map.get(reResourceitem);
			if (value != null) {
				isFound = true;
			}
			if (!isFound) {
				removedItemList.add(reResourceitem);
				itemIterator.remove();
			}
		}
		if (isEmpyCriteria) {
			return removedItemList;
		}
		return itemList;
	}

	@Override
	public void updateOrderNumbers(List<ReResourceitem> itemList) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "UPDATE RE_RESOURCEITEMS SET ORDERNR = ? WHERE ID = ?";
		List<Object[]> parameters = new ArrayList<Object[]>();
		for (ReResourceitem item : itemList) {
			parameters.add(new Object[] { item.getOrdernr(), item.getId() });
		}
		jdbcTemplate.batchUpdate(sql, parameters);
	}

	@Override
	public Integer getMaximumOrderNumberByResourceRef(int resourceref) {
		ReResourceitem item = repository.findTop1ByresourcerefOrderByOrdernrDesc(resourceref);
		if (item != null) {
			return item.getOrdernr();
		} else {
			return null;
		}
	}

	@Override
	public Integer getMaximumTagNumberByResourceRef(int resourceref) {
		ReResourceitem item = repository.findTop1ByresourcerefOrderByTagnrDesc(resourceref);
		if (item != null) {
			return item.getTagnr();
		} else {
			return null;
		}
	}

}