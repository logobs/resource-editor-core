package com.lbs.re.data.dao.language;

import java.util.List;

import com.lbs.re.model.languages.ReEnglishus;

public interface EnglishusDAO extends LanguageDAO<ReEnglishus, Integer> {
	List<ReEnglishus> getEnglishListBetweenItemIds(Integer maxId, Integer minId);
}
