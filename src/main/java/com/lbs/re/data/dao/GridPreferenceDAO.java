package com.lbs.re.data.dao;

import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.model.GridPreference;

public interface GridPreferenceDAO extends BaseDAO<GridPreference, Integer> {

	public GridPreference findByUserIdAndViewIdAndGridId(Integer userId, String viewId, String gridId) throws LocalizedException;

}