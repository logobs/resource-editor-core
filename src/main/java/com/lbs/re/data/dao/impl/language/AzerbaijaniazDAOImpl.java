package com.lbs.re.data.dao.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.language.AzerbaijaniazDAO;
import com.lbs.re.data.repository.language.AzerbaijaniazRepository;
import com.lbs.re.model.languages.ReAzerbaijaniaz;

@Component
public class AzerbaijaniazDAOImpl extends LanguageDAOImpl<ReAzerbaijaniaz, Integer> implements AzerbaijaniazDAO {
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
