package com.lbs.re.data.dao.impl.language;

import com.lbs.re.data.dao.impl.BaseDAOImpl;
import com.lbs.re.data.dao.language.PersianirDAO;
import com.lbs.re.data.repository.language.PersianirRepository;
import com.lbs.re.model.languages.RePersianir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersianirDAOImpl extends BaseDAOImpl<RePersianir, Integer> implements PersianirDAO {

    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient PersianirRepository repository;

    @Autowired
    public void setRepository(PersianirRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
