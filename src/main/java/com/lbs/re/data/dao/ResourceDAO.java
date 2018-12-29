package com.lbs.re.data.dao;

import com.lbs.re.model.ReResource;
import com.lbs.re.model.ReResourceGroup;

public interface ResourceDAO extends BaseDAO<ReResource, Integer>{
    ReResource getResourceByNumberAndGroup(int resourceNr, ReResourceGroup resourcegroup);
}
