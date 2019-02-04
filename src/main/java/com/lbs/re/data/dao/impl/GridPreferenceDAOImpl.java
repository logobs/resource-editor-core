package com.lbs.re.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.GridPreferenceDAO;
import com.lbs.re.data.repository.GridPreferenceRepository;
import com.lbs.re.exception.localized.GeneralLocalizedException;
import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.model.GridPreference;

@Component
public class GridPreferenceDAOImpl extends BaseDAOImpl<GridPreference, Integer> implements GridPreferenceDAO {

	private static final long serialVersionUID = 1L;

	private transient GridPreferenceRepository repository;

	@Autowired
	public void setRepository(GridPreferenceRepository repository) {
		this.repository = repository;
		super.setRepository(repository);
	}

	@Override
	public GridPreference findByUserIdAndViewIdAndGridId(Integer userId, String viewId, String gridId) throws LocalizedException {
		try {
			return repository.findByUserIdAndViewIdAndGridId(userId, viewId, gridId);
		} catch (Exception e) {
			throw new GeneralLocalizedException(e);
		}
	}

}
