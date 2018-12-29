package com.lbs.re.data.service.impl;

import com.lbs.re.data.dao.StandardDAO;
import com.lbs.re.data.service.StandardService;
import com.lbs.re.model.ReStandard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StandardServiceImpl extends BaseServiceImpl<ReStandard, Integer> implements StandardService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private StandardDAO dao;

    @Autowired
    public void setDao(StandardDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
