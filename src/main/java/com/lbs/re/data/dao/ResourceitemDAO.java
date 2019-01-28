package com.lbs.re.data.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;

import com.lbs.re.model.ReResourceitem;

public interface ResourceitemDAO extends BaseDAO<ReResourceitem, Integer> {
	List<ReResourceitem> getItemListByResource(int resourceref);

	void updateOrderNumbers(List<ReResourceitem> itemList);

	List<ReResourceitem> getLastModifiedItemList();

	List<ReResourceitem> getAdvancedSearchedItemList(List<Criterion> resourceItemCriterias, List<Criterion> turkishCriterias, List<Criterion> englishCriterias,
			List<Criterion> standardCriterias);
}
