package com.lbs.re.data.service.impl.language;

import com.lbs.re.data.dao.language.TurkmentmDAO;
import com.lbs.re.data.service.impl.BaseServiceImpl;
import com.lbs.re.data.service.language.TurkmentmService;
import com.lbs.re.model.languages.ReTurkmentm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurkmentmServiceImpl extends BaseServiceImpl<ReTurkmentm, Integer> implements TurkmentmService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private TurkmentmDAO dao;

    @Autowired
    public void setDao(TurkmentmDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
