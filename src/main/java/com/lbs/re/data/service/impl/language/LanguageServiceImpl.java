package com.lbs.re.data.service.impl.language;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lbs.re.data.dao.language.LanguageDAO;
import com.lbs.re.data.service.impl.BaseServiceImpl;
import com.lbs.re.data.service.language.LanguageService;
import com.lbs.re.model.ReLanguageTable;

public class LanguageServiceImpl<T extends ReLanguageTable, ID extends Serializable> extends BaseServiceImpl<T, Integer> implements LanguageService<T, ID> {

	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private LanguageDAO<T, Integer> dao;

	@Autowired
	public void setDao(LanguageDAO<T, Integer> dao) {
		this.dao = dao;
		super.setBaseDao(dao);
	}

	@Override
	public T getLanguageByresourceitemref(Integer resourceitemref) {
		return dao.getLanguageByresourceitemref(resourceitemref);
	}

	@Override
	public List<T> getLanguageListByresourceref(Integer resourceref) {
		return dao.getLanguageListByresourceref(resourceref);
	}

	@Override
	public void deleteLanguageByResourceItemref(Integer resourceitemref) {
		dao.deleteLanguageByResourceItemref(resourceitemref);
	}

}
