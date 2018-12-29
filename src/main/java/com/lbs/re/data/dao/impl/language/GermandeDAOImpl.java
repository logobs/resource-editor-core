package com.lbs.re.data.dao.impl.language;

import com.lbs.re.data.dao.impl.BaseDAOImpl;
import com.lbs.re.data.dao.language.GermandeDAO;
import com.lbs.re.data.repository.language.GermandeRepository;
import com.lbs.re.model.languages.ReGermande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GermandeDAOImpl extends BaseDAOImpl<ReGermande, Integer> implements GermandeDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient GermandeRepository repository;

    @Autowired
    public void setRepository(GermandeRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
