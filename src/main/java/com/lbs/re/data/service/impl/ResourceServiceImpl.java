package com.lbs.re.data.service.impl;

import com.lbs.re.data.dao.ResourceDAO;
import com.lbs.re.data.service.ResourceService;
import com.lbs.re.model.ReResource;
import com.lbs.re.model.ReResourceGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl extends BaseServiceImpl<ReResource, Integer> implements ResourceService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private ResourceDAO dao;

    @Autowired
    public void setDao(ResourceDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }

    @Override
    public ReResource getResourceByNumberAndGroup(int resourceNr, ReResourceGroup resourcegroup) {
        return dao.getResourceByNumberAndGroup(resourceNr, resourcegroup);
    }
}
