package com.lbs.re.data.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.StandardDAO;
import com.lbs.re.data.service.StandardService;
import com.lbs.re.model.ReStandard;

@Service
public class StandardServiceImpl extends BaseServiceImpl<ReStandard, Integer> implements StandardService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private StandardDAO dao;

    @Autowired
    public void setDao(StandardDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }

	@Override
	public ReStandard getStandardByResourceItemref(Integer resourceitemref) {
		return dao.getStandardByResourceItemref(resourceitemref);
	}

	@Override
	public void deleteStandardByResourceItemref(Integer resourceitemref) {
		dao.deleteStandardByResourceItemref(resourceitemref);
	}

	@Override
	public List<ReStandard> getStandardListByResourceref(Integer resourceref) {
		return dao.getStandardListByResourceref(resourceref);
	}

	@Override
	public List<ReStandard> getAllByResourceitemrefIn(List<Integer> resourceItemRefIdList) {
		return dao.getAllByResourceitemrefIn(resourceItemRefIdList);
	}

}
