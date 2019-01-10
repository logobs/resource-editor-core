package com.lbs.re.data.dao.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.language.RomanianroDAO;
import com.lbs.re.data.repository.language.RomanianroRepository;
import com.lbs.re.model.languages.ReRomanianro;

@Component
public class RomanianroDAOImpl extends LanguageDAOImpl<ReRomanianro, Integer> implements RomanianroDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient RomanianroRepository repository;

    @Autowired
    public void setRepository(RomanianroRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
