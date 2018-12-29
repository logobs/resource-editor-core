package com.lbs.re.data.dao.impl;

import com.lbs.re.data.dao.StandardDAO;
import com.lbs.re.data.repository.StandardRepository;
import com.lbs.re.model.ReStandard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StandardDAOImpl extends BaseDAOImpl<ReStandard, Integer> implements StandardDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient StandardRepository repository;

    @Autowired
    public void setRepository(StandardRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
