package com.lbs.re.data.service.impl.language;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.language.EnglishusDAO;
import com.lbs.re.data.service.language.EnglishusService;
import com.lbs.re.model.languages.ReEnglishus;

@Service
public class EnglishusServiceImpl extends LanguageServiceImpl<ReEnglishus, Integer> implements EnglishusService {
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
	public List<ReEnglishus> getEnglishListBetweenItemIds(Integer maxId, Integer minId) {
		return dao.getEnglishListBetweenItemIds(maxId, minId);
	}
}
