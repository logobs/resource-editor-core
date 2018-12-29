package com.lbs.re.data.repository;

import com.lbs.re.model.ReResource;
import com.lbs.re.model.ReResourceGroup;

public interface ResourceRepository extends BaseRepository<ReResource, Integer>{
    ReResource findByresourceNrAndresourcegroup(int resourceNr, ReResourceGroup resourcegroup);
}
