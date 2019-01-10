package com.lbs.re.data.dao.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.language.FrenchfrDAO;
import com.lbs.re.data.repository.language.FrenchfrRepository;
import com.lbs.re.model.languages.ReFrenchfr;

@Component
public class FrenchfrDAOImpl extends LanguageDAOImpl<ReFrenchfr, Integer> implements FrenchfrDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient FrenchfrRepository repository;

    @Autowired
    public void setRepository(FrenchfrRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
