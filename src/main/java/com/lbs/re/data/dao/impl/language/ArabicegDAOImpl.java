package com.lbs.re.data.dao.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.language.ArabicegDAO;
import com.lbs.re.data.repository.language.ArabicegRepository;
import com.lbs.re.model.languages.ReArabiceg;

@Component
public class ArabicegDAOImpl extends LanguageDAOImpl<ReArabiceg, Integer> implements ArabicegDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient ArabicegRepository repository;

    @Autowired
    public void setRepository(ArabicegRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
