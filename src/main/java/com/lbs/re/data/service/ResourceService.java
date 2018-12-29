package com.lbs.re.data.service;

import com.lbs.re.model.ReResource;
import com.lbs.re.model.ReResourceGroup;
import org.springframework.stereotype.Service;

@Service
public interface ResourceService extends BaseService<ReResource, Integer>{
    ReResource getResourceByNumberAndGroup(int resourceNr, ReResourceGroup resourcegroup);
}
