package com.lbs.re.data.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.lbs.re.data.unscan.BaseRepository;
import com.lbs.re.model.ReStandard;

public interface StandardRepository extends BaseRepository<ReStandard, Integer> {

	ReStandard findByresourceitemref(Integer resourceitemref);

	List<ReStandard> findByresourceref(Integer resourceref);

	List<ReStandard> findAllByResourceitemrefIn(List<Integer> resourceItemRefIdList);

	@Transactional
	void deleteByresourceitemref(Integer resourceitemref);
}
