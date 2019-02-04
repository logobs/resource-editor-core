package com.lbs.re.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.GridPreferenceDAO;
import com.lbs.re.data.service.GridPreferenceService;
import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.model.GridPreference;

@Service
public class GridPreferenceServiceImpl extends BaseServiceImpl<GridPreference, Integer> implements GridPreferenceService {

	private static final long serialVersionUID = 1L;

	private GridPreferenceDAO dao;

	@Autowired
	public void setDao(GridPreferenceDAO dao) {
		this.dao = dao;
		super.setBaseDao(dao);
	}

	@Override
	public GridPreference findByUserIdAndViewIdAndGridId(Integer userId, String viewId, String gridId) throws LocalizedException {
		return dao.findByUserIdAndViewIdAndGridId(userId, viewId, gridId);
	}

}