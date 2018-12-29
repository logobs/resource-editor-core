package com.lbs.re.data.service.impl;

import com.lbs.re.data.dao.ProjectDAO;
import com.lbs.re.data.service.ProjectService;
import com.lbs.re.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project, Integer> implements ProjectService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private ProjectDAO dao;

    @Autowired
    public void setDao(ProjectDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }

    @Override
    public List<Project> getProjectListByNameLike(String nameFilter) {
        return dao.getProjectListByNameLike(nameFilter);
    }
}
