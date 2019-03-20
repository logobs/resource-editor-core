package com.lbs.re.data.dao;

import com.lbs.re.model.ReResource;
import com.lbs.re.model.ReResourceGroup;

public interface ResourceDAO extends BaseDAO<ReResource, Integer> {
	ReResource getResourceByNumber(int resourceNr);

	ReResource getResourceByNumberAndGroup(int resourceNr, ReResourceGroup resourcegroup);

	int getMaxResourceNumber();

	int getFirstAvailableResourceNumber(int resourceNr);
}
