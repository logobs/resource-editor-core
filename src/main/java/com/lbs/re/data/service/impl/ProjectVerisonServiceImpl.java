package com.lbs.re.data.service.impl;

import com.lbs.re.data.dao.ProjectVerisonDAO;
import com.lbs.re.data.service.ProjectVerisonService;
import com.lbs.re.model.ReProjectVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectVerisonServiceImpl extends BaseServiceImpl<ReProjectVersion, Integer> implements ProjectVerisonService{
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private ProjectVerisonDAO dao;

    @Autowired
    public void setDao(ProjectVerisonDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
