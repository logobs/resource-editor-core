package com.lbs.re.data.repository;

import com.lbs.re.data.unscan.BaseRepository;
import com.lbs.re.model.ReResource;

public interface ResourceRepository extends BaseRepository<ReResource, Integer>{
	ReResource findByresourceNr(int resourceNr);
}
