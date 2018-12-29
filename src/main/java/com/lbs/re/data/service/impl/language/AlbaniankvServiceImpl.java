package com.lbs.re.data.service.impl.language;

import com.lbs.re.data.dao.language.AlbaniankvDAO;
import com.lbs.re.data.service.impl.BaseServiceImpl;
import com.lbs.re.data.service.language.AlbaniankvService;
import com.lbs.re.model.languages.ReAlbaniankv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbaniankvServiceImpl extends BaseServiceImpl<ReAlbaniankv, Integer> implements AlbaniankvService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private AlbaniankvDAO dao;

    @Autowired
    public void setDao(AlbaniankvDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }
}
