package com.lbs.re.data.service.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.language.BulgarianbgDAO;
import com.lbs.re.data.service.language.BulgarianbgService;
import com.lbs.re.model.languages.ReBulgarianbg;

@Service
public class BulgarianbgServiceImpl extends LanguageServiceImpl<ReBulgarianbg, Integer> implements BulgarianbgService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private BulgarianbgDAO dao;

    @Autowired
    public void setDao(BulgarianbgDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
