package com.lbs.re.data.repository;

import com.lbs.re.model.ReResource;

public interface ResourceRepository extends BaseRepository<ReResource, Integer>{
	ReResource findByresourceNr(int resourceNr);
}
