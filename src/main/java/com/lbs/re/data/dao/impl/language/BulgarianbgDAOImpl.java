package com.lbs.re.data.dao.impl.language;

import com.lbs.re.data.dao.impl.BaseDAOImpl;
import com.lbs.re.data.dao.language.BulgarianbgDAO;
import com.lbs.re.data.repository.language.BulgarianbgRepository;
import com.lbs.re.model.languages.ReBulgarianbg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BulgarianbgDAOImpl extends BaseDAOImpl<ReBulgarianbg, Integer> implements BulgarianbgDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient BulgarianbgRepository repository;

    @Autowired
    public void setRepository(BulgarianbgRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
