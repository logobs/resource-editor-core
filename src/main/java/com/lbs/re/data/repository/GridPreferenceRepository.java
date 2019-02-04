package com.lbs.re.data.repository;

import com.lbs.re.data.unscan.BaseRepository;
import com.lbs.re.model.GridPreference;

public interface GridPreferenceRepository extends BaseRepository<GridPreference, Integer> {

	public GridPreference findByUserIdAndViewIdAndGridId(Integer userId, String viewId, String gridId);

}