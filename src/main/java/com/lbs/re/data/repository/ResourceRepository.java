package com.lbs.re.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.lbs.re.data.unscan.BaseRepository;
import com.lbs.re.model.ReResource;

public interface ResourceRepository extends BaseRepository<ReResource, Integer> {
	ReResource findByresourceNr(int resourceNr);

	@Query("SELECT MAX(res.resourceNr) from ReResource res")
	int getMaxResourceNumber();

	@Query("SELECT resourceNr from ReResource r where r.resourceNr > ?1 order by r.resourceNr ASC")
	List<Integer> getResourceNrList(int resourceNr);
}
