package com.lbs.re.data.unscan;

import java.io.Serializable;
import java.util.List;

import com.lbs.re.model.ReLanguageTable;

public interface LanguageRepository<T extends ReLanguageTable, ID extends Serializable> extends BaseRepository<T, ID> {
	T findByresourceitemref(Integer resourceitemref);

	List<T> findByresourceref(Integer resourceref);
}
