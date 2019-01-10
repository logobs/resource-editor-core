package com.lbs.re.data.service.language;

import java.io.Serializable;
import java.util.List;

import com.lbs.re.data.service.BaseService;
import com.lbs.re.model.ReLanguageTable;

public interface LanguageService<T extends ReLanguageTable, ID extends Serializable> extends BaseService<T, Integer> {
	T getLanguageByresourceitemref(Integer resourceitemref);

	List<T> getLanguageListByresourceref(Integer resourceref);
}
