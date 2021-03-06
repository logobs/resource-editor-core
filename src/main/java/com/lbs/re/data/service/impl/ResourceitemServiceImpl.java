package com.lbs.re.data.service.impl;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.ResourceitemDAO;
import com.lbs.re.data.service.ResourceitemService;
import com.lbs.re.model.ReResourceitem;

@Service
public class ResourceitemServiceImpl extends BaseServiceImpl<ReResourceitem, Integer> implements ResourceitemService {
	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private ResourceitemDAO dao;

	@Autowired
	public void setDao(ResourceitemDAO dao) {
		this.dao = dao;
		super.setBaseDao(dao);
	}

	@Override
	public List<ReResourceitem> getItemListByResource(int resourceref) {
		return dao.getItemListByResource(resourceref);
	}

	@Override
	public void updateOrderNumbers(List<ReResourceitem> itemList) {
		dao.updateOrderNumbers(itemList);
	}

	@Override
	public List<ReResourceitem> getLimitedItemList() {
		return dao.getLastModifiedItemList();
	}

	@Override
	public List<ReResourceitem> getAdvancedSearchedItemList(List<Criterion> resourceItemCriterias, List<Criterion> turkishCriterias, List<Criterion> englishCriterias,
			List<Criterion> standardCriterias) {
		return dao.getAdvancedSearchedItemList(resourceItemCriterias, turkishCriterias, englishCriterias, standardCriterias);
	}

	@Override
	public Integer getMaximumOrderNumberByResourceRef(int resourceref) {
		return dao.getMaximumOrderNumberByResourceRef(resourceref);
	}

	@Override
	public Integer getMaximumTagNumberByResourceRef(int resourceref) {
		return dao.getMaximumTagNumberByResourceRef(resourceref);
	}
}
