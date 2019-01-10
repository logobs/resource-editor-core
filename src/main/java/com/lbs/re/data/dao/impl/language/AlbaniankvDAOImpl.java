package com.lbs.re.data.dao.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.language.AlbaniankvDAO;
import com.lbs.re.data.repository.language.AlbaniankvRepository;
import com.lbs.re.model.languages.ReAlbaniankv;

@Component
public class AlbaniankvDAOImpl extends LanguageDAOImpl<ReAlbaniankv, Integer> implements AlbaniankvDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient AlbaniankvRepository repository;

    @Autowired
    public void setRepository(AlbaniankvRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
