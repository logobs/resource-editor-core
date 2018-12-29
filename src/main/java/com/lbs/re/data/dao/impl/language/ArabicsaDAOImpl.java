package com.lbs.re.data.dao.impl.language;

import com.lbs.re.data.dao.impl.BaseDAOImpl;
import com.lbs.re.data.dao.language.ArabicsaDAO;
import com.lbs.re.data.repository.language.ArabicsaRepository;
import com.lbs.re.model.languages.ReArabicsa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArabicsaDAOImpl extends BaseDAOImpl<ReArabicsa, Integer> implements ArabicsaDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient ArabicsaRepository repository;

    @Autowired
    public void setRepository(ArabicsaRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }
}
