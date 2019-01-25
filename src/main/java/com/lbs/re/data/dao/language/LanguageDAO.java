package com.lbs.re.data.dao.language;

import java.io.Serializable;
import java.util.List;

import com.lbs.re.data.dao.BaseDAO;
import com.lbs.re.model.ReLanguageTable;

public interface LanguageDAO<T extends ReLanguageTable, ID extends Serializable> extends BaseDAO<T, Integer> {
	T getLanguageByresourceitemref(Integer resourceitemref);

	List<T> getLanguageListByresourceref(Integer resourceref);

	void deleteLanguageByResourceItemref(Integer resourceitemref);

	List<T> getAllByResourceitemrefIn(List<Integer> resourceItemRefIdList);
}
