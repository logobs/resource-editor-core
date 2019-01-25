package com.lbs.re.data.service.language;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lbs.re.model.languages.ReEnglishus;

@Service
public interface EnglishusService extends LanguageService<ReEnglishus, Integer> {
	List<ReEnglishus> getEnglishListBetweenItemIds(Integer maxId, Integer minId);
}
