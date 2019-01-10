package com.lbs.re.data.service.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.language.AzerbaijaniazDAO;
import com.lbs.re.data.service.language.AzerbaijaniazService;
import com.lbs.re.model.languages.ReAzerbaijaniaz;

@Service
public class AzerbaijaniazServiceImpl extends LanguageServiceImpl<ReAzerbaijaniaz, Integer> implements AzerbaijaniazService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private AzerbaijaniazDAO dao;

    @Autowired
    public void setDao(AzerbaijaniazDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
