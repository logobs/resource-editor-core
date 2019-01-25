package com.lbs.re.data.dao.impl.language;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.language.TurkishtrDAO;
import com.lbs.re.data.repository.language.TurkishtrRepository;
import com.lbs.re.model.languages.ReTurkishtr;

@Component
public class TurkishtrDAOImpl extends LanguageDAOImpl<ReTurkishtr, Integer> implements TurkishtrDAO {
	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private transient TurkishtrRepository repository;

	@Autowired
	public void setRepository(TurkishtrRepository repository) {
		this.repository = repository;
		super.setRepository(repository);
	}

	@Override
	public List<ReTurkishtr> getTurkishListBetweenItemIds(Integer maxId, Integer minId) {
		return repository.findAllByResourceitemrefLessThanEqualAndResourceitemrefGreaterThanEqual(maxId, minId);
	}

}
