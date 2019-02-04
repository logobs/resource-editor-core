package com.lbs.re.data.repository;

import java.util.List;

import com.lbs.re.data.unscan.BaseRepository;
import com.lbs.re.model.ReResourceitem;

public interface ResourceitemRepository extends BaseRepository<ReResourceitem, Integer> {
	List<ReResourceitem> findByresourceref(int resourceref);

	ReResourceitem findTop1ByresourcerefOrderByOrdernrDesc(int resourceref);

	ReResourceitem findTop1ByresourcerefOrderByTagnrDesc(int resourceref);
}
