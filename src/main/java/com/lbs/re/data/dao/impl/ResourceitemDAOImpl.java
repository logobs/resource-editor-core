package com.lbs.re.data.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.ResourceitemDAO;
import com.lbs.re.data.repository.ResourceitemRepository;
import com.lbs.re.model.ReResourceitem;

@Component
public class ResourceitemDAOImpl extends BaseDAOImpl<ReResourceitem, Integer> implements ResourceitemDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient ResourceitemRepository repository;

    @Autowired
    public void setRepository(ResourceitemRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }

	@Override
	public List<ReResourceitem> getItemListByResource(int resourceref) {
		return repository.findByresourceref(resourceref);
	}

}
