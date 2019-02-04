package com.lbs.re.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.ResourceDAO;
import com.lbs.re.data.service.ResourceService;
import com.lbs.re.model.ReResource;

@Service
public class ResourceServiceImpl extends BaseServiceImpl<ReResource, Integer> implements ResourceService {
	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private ResourceDAO dao;

	@Autowired
	public void setDao(ResourceDAO dao) {
		this.dao = dao;
		super.setBaseDao(dao);
	}

	@Override
	public ReResource getResourceByNumber(int resourceNr) {
		return dao.getResourceByNumber(resourceNr);
	}

	@Override
	public int getMaxResourceNumber() {
		// TODO Auto-generated method stub
		return dao.getMaxResourceNumber();
	}

	@Override
	public int getFirstAvailableResourceNumber(int resourceNr) {
		return dao.getFirstAvailableResourceNumber(resourceNr);
	}
}
