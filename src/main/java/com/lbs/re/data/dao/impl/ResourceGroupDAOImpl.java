package com.lbs.re.data.dao.impl;

import com.lbs.re.data.dao.ResourceGroupDAO;
import com.lbs.re.data.repository.ResourceGroupRepository;
import com.lbs.re.model.ReResourceGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResourceGroupDAOImpl extends BaseDAOImpl<ReResourceGroup, Integer> implements ResourceGroupDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient ResourceGroupRepository repository;

    @Autowired
    public void setRepository(ResourceGroupRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
