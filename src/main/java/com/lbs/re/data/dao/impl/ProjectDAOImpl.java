package com.lbs.re.data.dao.impl;

import com.lbs.re.data.dao.ProjectDAO;
import com.lbs.re.data.repository.ProjectRepository;
import com.lbs.re.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectDAOImpl extends BaseDAOImpl<Project, Integer> implements ProjectDAO {

    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient ProjectRepository repository;

    @Autowired
    public void setRepository(ProjectRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }


    @Override
    public List<Project> getProjectListByNameLike(String nameFilter) {
        return repository.findByprojectNameLikeIgnoreCase(nameFilter);
    }
}
