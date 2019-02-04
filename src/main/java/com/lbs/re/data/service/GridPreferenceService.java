package com.lbs.re.data.service;

import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.model.GridPreference;

public interface GridPreferenceService extends BaseService<GridPreference, Integer> {

	public GridPreference findByUserIdAndViewIdAndGridId(Integer userId, String viewId, String gridId) throws LocalizedException;

}
