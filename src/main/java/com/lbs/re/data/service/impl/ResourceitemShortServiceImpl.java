package com.lbs.re.data.service.impl;

import com.lbs.re.data.dao.ResourceitemShortDAO;
import com.lbs.re.data.service.ResourceitemShortService;
import com.lbs.re.model.ReResourceitemShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceitemShortServiceImpl extends BaseServiceImpl<ReResourceitemShort, Integer> implements ResourceitemShortService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private ResourceitemShortDAO dao;

    @Autowired
    public void setDao(ResourceitemShortDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
