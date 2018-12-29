package com.lbs.re.data.dao.impl.language;

import com.lbs.re.data.dao.impl.BaseDAOImpl;
import com.lbs.re.data.dao.language.AzerbaijaniazDAO;
import com.lbs.re.data.repository.language.AzerbaijaniazRepository;
import com.lbs.re.model.languages.ReAzerbaijaniaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AzerbaijaniazDAOImpl extends BaseDAOImpl<ReAzerbaijaniaz, Integer> implements AzerbaijaniazDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient AzerbaijaniazRepository repository;

    @Autowired
    public void setRepository(AzerbaijaniazRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
