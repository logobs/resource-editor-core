package com.lbs.re.data.service.impl.language;

import com.lbs.re.data.dao.language.GermandeDAO;
import com.lbs.re.data.service.impl.BaseServiceImpl;
import com.lbs.re.data.service.language.GermandeService;
import com.lbs.re.model.languages.ReGermande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GermandeServiceImpl extends BaseServiceImpl<ReGermande, Integer> implements GermandeService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private GermandeDAO dao;

    @Autowired
    public void setDao(GermandeDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
