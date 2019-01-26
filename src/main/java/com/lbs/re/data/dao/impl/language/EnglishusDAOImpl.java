package com.lbs.re.data.dao.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.language.EnglishusDAO;
import com.lbs.re.data.repository.language.EnglishusRepository;
import com.lbs.re.model.languages.ReEnglishus;

@Component
public class EnglishusDAOImpl extends LanguageDAOImpl<ReEnglishus, Integer> implements EnglishusDAO {
	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private transient EnglishusRepository repository;

	@Autowired
	public void setRepository(EnglishusRepository repository) {
		this.repository = repository;
		super.setRepository(repository);
	}
}
