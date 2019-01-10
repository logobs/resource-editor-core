package com.lbs.re.data.service.impl.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.language.ArabicegDAO;
import com.lbs.re.data.service.language.ArabicegService;
import com.lbs.re.model.languages.ReArabiceg;

@Service
public class ArabicegServiceImpl extends LanguageServiceImpl<ReArabiceg, Integer> implements ArabicegService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private ArabicegDAO dao;

    @Autowired
    public void setDao(ArabicegDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
