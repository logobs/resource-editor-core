package com.lbs.re.data.dao.impl.language;

import com.lbs.re.data.dao.impl.BaseDAOImpl;
import com.lbs.re.data.dao.language.GeorgiangeDAO;
import com.lbs.re.data.repository.language.GeorgiangeRepository;
import com.lbs.re.model.languages.ReGeorgiange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GeorgiangeDAOImpl extends BaseDAOImpl<ReGeorgiange, Integer> implements GeorgiangeDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient GeorgiangeRepository repository;

    @Autowired
    public void setRepository(GeorgiangeRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
