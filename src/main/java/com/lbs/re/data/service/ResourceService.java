package com.lbs.re.data.service;

import org.springframework.stereotype.Service;

import com.lbs.re.model.ReResource;

@Service
public interface ResourceService extends BaseService<ReResource, Integer> {
	ReResource getResourceByNumber(int resourceNr);

	int getMaxResourceNumber();

	int getFirstAvailableResourceNumber(int resourceNr);
}
