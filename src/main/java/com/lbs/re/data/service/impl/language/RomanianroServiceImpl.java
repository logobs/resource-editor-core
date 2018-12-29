package com.lbs.re.data.service.impl.language;

import com.lbs.re.data.dao.language.RomanianroDAO;
import com.lbs.re.data.service.impl.BaseServiceImpl;
import com.lbs.re.data.service.language.RomanianroService;
import com.lbs.re.model.languages.ReRomanianro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RomanianroServiceImpl extends BaseServiceImpl<ReRomanianro, Integer> implements RomanianroService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private RomanianroDAO dao;

    @Autowired
    public void setDao(RomanianroDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
