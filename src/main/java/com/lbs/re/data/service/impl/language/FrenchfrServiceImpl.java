package com.lbs.re.data.service.impl.language;

import com.lbs.re.data.dao.language.FrenchfrDAO;
import com.lbs.re.data.service.impl.BaseServiceImpl;
import com.lbs.re.data.service.language.FrenchfrService;
import com.lbs.re.model.languages.ReFrenchfr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrenchfrServiceImpl extends BaseServiceImpl<ReFrenchfr, Integer> implements FrenchfrService{
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private FrenchfrDAO dao;

    @Autowired
    public void setDao(FrenchfrDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
