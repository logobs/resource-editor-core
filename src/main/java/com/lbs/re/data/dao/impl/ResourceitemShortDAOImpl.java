package com.lbs.re.data.dao.impl;

import com.lbs.re.data.dao.ResourceitemShortDAO;
import com.lbs.re.data.repository.ResourceitemShortRepository;
import com.lbs.re.model.ReResourceitemShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResourceitemShortDAOImpl extends BaseDAOImpl<ReResourceitemShort, Integer> implements ResourceitemShortDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient ResourceitemShortRepository repository;

    @Autowired
    public void setRepository(ResourceitemShortRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }

}
