package com.lbs.re.data.service.impl.language;

import com.lbs.re.data.dao.language.ArabicsaDAO;
import com.lbs.re.data.service.impl.BaseServiceImpl;
import com.lbs.re.data.service.language.ArabicsaService;
import com.lbs.re.model.languages.ReArabicsa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArabicsaServiceImpl extends BaseServiceImpl<ReArabicsa, Integer> implements ArabicsaService {

    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private ArabicsaDAO dao;

    @Autowired
    public void setDao(ArabicsaDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
