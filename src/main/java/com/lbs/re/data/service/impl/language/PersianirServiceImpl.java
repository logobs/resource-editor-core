package com.lbs.re.data.service.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.language.PersianirDAO;
import com.lbs.re.data.service.language.PersianirService;
import com.lbs.re.model.languages.RePersianir;

@Service
public class PersianirServiceImpl extends LanguageServiceImpl<RePersianir, Integer> implements PersianirService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private PersianirDAO dao;

    @Autowired
    public void setDao(PersianirDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
