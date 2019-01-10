package com.lbs.re.data.service.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.language.GeorgiangeDAO;
import com.lbs.re.data.service.language.GeorgiangeService;
import com.lbs.re.model.languages.ReGeorgiange;

@Service
public class GeorgiangeServiceImpl extends LanguageServiceImpl<ReGeorgiange, Integer> implements GeorgiangeService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private GeorgiangeDAO dao;

    @Autowired
    public void setDao(GeorgiangeDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
