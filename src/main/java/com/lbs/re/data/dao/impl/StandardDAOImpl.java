package com.lbs.re.data.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.StandardDAO;
import com.lbs.re.data.repository.StandardRepository;
import com.lbs.re.model.ReStandard;

@Component
public class StandardDAOImpl extends BaseDAOImpl<ReStandard, Integer> implements StandardDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient StandardRepository repository;

    @Autowired
    public void setRepository(StandardRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }

	@Override
	public ReStandard getStandardByResourceItemref(Integer resourceitemref) {
		return repository.findByresourceitemref(resourceitemref);
	}

	@Override
	public void deleteStandardByResourceItemref(Integer resourceitemref) {
		repository.deleteByresourceitemref(resourceitemref);
	}

	@Override
	public List<ReStandard> getStandardListByResourceref(Integer resourceref) {
		return repository.findByresourceref(resourceref);
	}

	@Override
	public List<ReStandard> getAllByResourceitemrefIn(List<Integer> resourceItemRefIdList) {
		return repository.findAllByResourceitemrefIn(resourceItemRefIdList);
	}

}
