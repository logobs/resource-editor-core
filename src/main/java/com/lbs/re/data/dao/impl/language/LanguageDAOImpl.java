package com.lbs.re.data.dao.impl.language;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lbs.re.data.dao.impl.BaseDAOImpl;
import com.lbs.re.data.dao.language.LanguageDAO;
import com.lbs.re.data.unscan.LanguageRepository;
import com.lbs.re.model.ReLanguageTable;

public class LanguageDAOImpl<T extends ReLanguageTable, ID extends Serializable> extends BaseDAOImpl<T, Integer> implements LanguageDAO<T, ID> {

	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private transient LanguageRepository<T, Integer> repository;

	@Autowired
	public void setRepository(LanguageRepository<T, Integer> repository) {
		this.repository = repository;
		super.setRepository(repository);
	}

	@Override
	public T getLanguageByresourceitemref(Integer resourceitemref) {
		return repository.findByresourceitemref(resourceitemref);
	}

	@Override
	public List<T> getLanguageListByresourceref(Integer resourceref) {
		return repository.findByresourceref(resourceref);
	}

}
