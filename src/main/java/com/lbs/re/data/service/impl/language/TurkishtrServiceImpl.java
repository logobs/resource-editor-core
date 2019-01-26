package com.lbs.re.data.service.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.language.TurkishtrDAO;
import com.lbs.re.data.service.language.TurkishtrService;
import com.lbs.re.model.languages.ReTurkishtr;

@Service
public class TurkishtrServiceImpl extends LanguageServiceImpl<ReTurkishtr, Integer> implements TurkishtrService {
	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private TurkishtrDAO dao;

	@Autowired
	public void setDao(TurkishtrDAO dao) {
		this.dao = dao;
		super.setBaseDao(dao);
	}

}
