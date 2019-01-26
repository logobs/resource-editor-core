package com.lbs.re.data.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.ResourceitemDAO;
import com.lbs.re.data.repository.ResourceitemRepository;
import com.lbs.re.model.ReResource;
import com.lbs.re.model.ReResourceitem;

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

	private int ITEM_COUNT = 2000;

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

	@Override
	@Transactional
	public List<ReResourceitem> getLimitedItemList() {
		Criteria criteriaResourceItem = em.unwrap(Session.class).createCriteria(ReResourceitem.class);
		criteriaResourceItem.addOrder(Order.desc("modifiedon"));
		criteriaResourceItem.setMaxResults(100);
		return criteriaResourceItem.list();
	}

	@Override
	@Transactional
	public List<ReResourceitem> getAdvancedSearchedItemList(List<Criterion> resourceItemCriterias, List<Criterion> resourceCriterias) {
		List<Integer> resourceIdList = new ArrayList<>();
		List<Integer> resourceItemIdList = new ArrayList<>();

		Criteria criteriaResource = em.unwrap(Session.class).createCriteria(ReResource.class);
		for (Criterion criterion : resourceCriterias) {
			criteriaResource.add(criterion);
		}
		List<ReResource> resourceList = criteriaResource.list();
		for (ReResource resource : resourceList) {
			resourceIdList.add(resource.getId());
		}
		resourceIdList = checkOverSize(resourceIdList);

		Criteria criteriaResourceItem = em.unwrap(Session.class).createCriteria(ReResourceitem.class);
		for (Criterion criterion : resourceItemCriterias) {
			criteriaResourceItem.add(criterion);
		}
		if (resourceList.isEmpty()) {
			return new ArrayList<>();
		} else {
			criteriaResourceItem.add(Restrictions.in("resourceref", resourceIdList));
		}
		List<ReResourceitem> itemList = criteriaResourceItem.list();
		for (ReResourceitem item : itemList) {
			resourceItemIdList.add(item.getId());
		}
		resourceItemIdList = checkOverSize(resourceItemIdList);

		return itemList;

	}

	private List<Integer> checkOverSize(List<Integer> idList) {
		if (idList.size() > ITEM_COUNT) {
			System.out.println("OVERFLOWWWWWWWW");
			idList = idList.subList(0, ITEM_COUNT);
		}
		return idList;
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

}
