package com.lbs.re.data.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.ResourceDAO;
import com.lbs.re.data.repository.ResourceRepository;
import com.lbs.re.model.ReResource;
import com.lbs.re.model.ReResourceGroup;

@Component
public class ResourceDAOImpl extends BaseDAOImpl<ReResource, Integer> implements ResourceDAO {
	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private transient ResourceRepository repository;

	@Autowired
	public void setRepository(ResourceRepository repository) {
		this.repository = repository;
		super.setRepository(repository);
	}

	@Override
	public ReResource getResourceByNumber(int resourceNr) {
		return repository.findByresourceNr(resourceNr);
	}

	@Override
	public int getMaxResourceNumber() {
		return repository.getMaxResourceNumber();
	}

	@Override
	public int getFirstAvailableResourceNumber(int resourceNr) {
		List<Integer> resourceNrList = repository.getResourceNrList(resourceNr);
		int before = resourceNrList.get(0);
		int result = 0;
		for (Integer number : resourceNrList) {
			if (number - before > 1) {
				result = before + 1;
				break;
			}
			before = number;
		}
		return result;
	}

	@Override
	public ReResource getResourceByNumberAndGroup(int resourceNr, ReResourceGroup resourcegroup) {
		return repository.getResourceListByNumberAndGroup(resourceNr, resourcegroup);
	}
}
