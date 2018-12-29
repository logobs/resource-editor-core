package com.lbs.re.data.dao.impl.language;

import com.lbs.re.data.dao.impl.BaseDAOImpl;
import com.lbs.re.data.dao.language.TurkmentmDAO;
import com.lbs.re.data.repository.language.TurkmentmRepository;
import com.lbs.re.model.languages.ReTurkmentm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TurkmentmDAOImpl extends BaseDAOImpl<ReTurkmentm, Integer> implements TurkmentmDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient TurkmentmRepository repository;

    @Autowired
    public void setRepository(TurkmentmRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
