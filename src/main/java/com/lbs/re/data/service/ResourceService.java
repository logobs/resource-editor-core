package com.lbs.re.data.service;

import org.springframework.stereotype.Service;

import com.lbs.re.model.ReResource;
import com.lbs.re.model.ReResourceGroup;

@Service
public interface ResourceService extends BaseService<ReResource, Integer> {
	ReResource getResourceByNumber(int resourceNr);

	ReResource getResourceByNumberAndGroup(int resourceNr, ReResourceGroup resourceGroup);

	int getMaxResourceNumber();

	int getFirstAvailableResourceNumber(int resourceNr);
}
