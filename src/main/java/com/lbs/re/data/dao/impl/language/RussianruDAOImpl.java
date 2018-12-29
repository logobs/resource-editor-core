package com.lbs.re.data.dao.impl.language;

import com.lbs.re.data.dao.impl.BaseDAOImpl;
import com.lbs.re.data.dao.language.RussianruDAO;
import com.lbs.re.data.repository.language.RussianruRepository;
import com.lbs.re.model.languages.ReRussianru;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RussianruDAOImpl extends BaseDAOImpl<ReRussianru, Integer> implements RussianruDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient RussianruRepository repository;

    @Autowired
    public void setRepository(RussianruRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
