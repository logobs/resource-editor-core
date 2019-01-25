package com.lbs.re.data.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lbs.re.model.ReStandard;

@Service
public interface StandardService extends BaseService<ReStandard, Integer> {
	ReStandard getStandardByResourceItemref(Integer resourceitemref);

	void deleteStandardByResourceItemref(Integer resourceitemref);

	List<ReStandard> getStandardListByResourceref(Integer resourceref);

	List<ReStandard> getAllByResourceitemrefIn(List<Integer> resourceItemRefIdList);
}
