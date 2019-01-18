package com.lbs.re.data.dao;

import com.lbs.re.model.ReResource;

public interface ResourceDAO extends BaseDAO<ReResource, Integer> {
	ReResource getResourceByNumber(int resourceNr);

	int getMaxResourceNumber();
}
