package com.lbs.re.data.dao;

import java.util.List;

import com.lbs.re.model.ReStandard;

public interface StandardDAO extends BaseDAO<ReStandard, Integer> {
	ReStandard getStandardByResourceItemref(Integer resourceitemref);

	List<ReStandard> getStandardListByResourceref(Integer resourceref);

	void deleteStandardByResourceItemref(Integer resourceitemref);

	List<ReStandard> getAllByResourceitemrefIn(List<Integer> resourceItemRefIdList);
}
