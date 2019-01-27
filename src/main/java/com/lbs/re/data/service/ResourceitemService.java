package com.lbs.re.data.service;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Service;

import com.lbs.re.model.ReResourceitem;

@Service
public interface ResourceitemService extends BaseService<ReResourceitem, Integer> {
	List<ReResourceitem> getItemListByResource(int resourceref);

	List<ReResourceitem> getLimitedItemList();

	void updateOrderNumbers(List<ReResourceitem> itemList);

	List<ReResourceitem> getAdvancedSearchedItemList(List<Criterion> resourceItemCriterias, List<Criterion> resourceCriterias, List<Criterion> turkishCriterias,
			List<Criterion> englishCriterias, List<Criterion> standardCriterias);
}
