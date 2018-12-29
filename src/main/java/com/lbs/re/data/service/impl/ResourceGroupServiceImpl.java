package com.lbs.re.data.service.impl;

import com.lbs.re.data.dao.ResourceGroupDAO;
import com.lbs.re.data.service.ResourceGroupService;
import com.lbs.re.model.ReResourceGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceGroupServiceImpl extends BaseServiceImpl<ReResourceGroup, Integer> implements ResourceGroupService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private ResourceGroupDAO dao;

    @Autowired
    public void setDao(ResourceGroupDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
