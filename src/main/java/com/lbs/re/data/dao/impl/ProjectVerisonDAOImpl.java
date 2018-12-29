package com.lbs.re.data.dao.impl;

import com.lbs.re.data.dao.ProjectVerisonDAO;
import com.lbs.re.data.repository.ProjectVerisonRepository;
import com.lbs.re.model.ReProjectVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectVerisonDAOImpl extends BaseDAOImpl<ReProjectVersion, Integer> implements ProjectVerisonDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient ProjectVerisonRepository repository;

    @Autowired
    public void setRepository(ProjectVerisonRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }

}
