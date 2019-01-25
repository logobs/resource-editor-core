package com.lbs.re.data.service.language;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lbs.re.model.languages.ReTurkishtr;

@Service
public interface TurkishtrService extends LanguageService<ReTurkishtr, Integer> {
	List<ReTurkishtr> getTurkishListBetweenItemIds(Integer maxId, Integer minId);
}
