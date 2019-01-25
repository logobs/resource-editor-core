package com.lbs.re.data.dao.language;

import java.util.List;

import com.lbs.re.model.languages.ReTurkishtr;

public interface TurkishtrDAO extends LanguageDAO<ReTurkishtr, Integer> {
	List<ReTurkishtr> getTurkishListBetweenItemIds(Integer maxId, Integer minId);
}
