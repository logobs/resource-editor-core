package com.lbs.re.data.service.impl.language;

import com.lbs.re.data.dao.language.EnglishusDAO;
import com.lbs.re.data.service.impl.BaseServiceImpl;
import com.lbs.re.data.service.language.EnglishusService;
import com.lbs.re.model.languages.ReEnglishus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnglishusServiceImpl extends BaseServiceImpl<ReEnglishus, Integer> implements EnglishusService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private EnglishusDAO dao;

    @Autowired
    public void setDao(EnglishusDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }

    @Override
    public ReEnglishus getEnglishusByResourceitem(Integer resourceitemref) {
        return dao.getEnglishusByResourceitem(resourceitemref);
    }
}
