package com.lbs.re.data.dao.impl.language;

import com.lbs.re.data.dao.impl.BaseDAOImpl;
import com.lbs.re.data.dao.language.TurkishtrDAO;
import com.lbs.re.data.repository.language.TurkishtrRepository;
import com.lbs.re.model.languages.ReTurkishtr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TurkishtrDAOImpl extends BaseDAOImpl<ReTurkishtr, Integer> implements TurkishtrDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient TurkishtrRepository repository;

    @Autowired
    public void setRepository(TurkishtrRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }

    @Override
    public ReTurkishtr getTurkishtrByResourceitem(Integer resourceitemref) {
        return repository.findByresourceitemref(resourceitemref);
    }
}
