package com.lbs.re.data.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.ResourceGroupDAO;
import com.lbs.re.data.service.ResourceGroupService;
import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.model.ReResourceGroup;

@Service
public class ResourceGroupServiceImpl implements ResourceGroupService {

	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private ResourceGroupDAO<ReResourceGroup, String> dao;

	@Autowired
	public void setBaseDao(ResourceGroupDAO<ReResourceGroup, String> dao) {
		this.dao = dao;
	}

	@Override
	public ReResourceGroup getById(String id) throws LocalizedException {
		ReResourceGroup item = dao.getById(id);
		afterGet(Arrays.asList(item));
		return item;
	}

	@Override
	public ReResourceGroup save(ReResourceGroup entity) throws LocalizedException {
		beforeSave(entity);
		ReResourceGroup saved = dao.save(entity);
		return saved;
	}

	@Override
	public List<ReResourceGroup> save(List<ReResourceGroup> entityList) throws LocalizedException {
		List<ReResourceGroup> savedEntityList = dao.save(entityList);
		return savedEntityList;
	}

	@Override
	public void delete(ReResourceGroup entity) throws LocalizedException {
		beforeDelete(entity);
		dao.delete(entity);
	}

	@Override
	public void deleteById(String id) throws LocalizedException {
		beforeDelete(id);
		dao.deleteById(id);
	}

	@Override
	public List<ReResourceGroup> getAll() throws LocalizedException {
		List<ReResourceGroup> itemList = dao.getAll();
		afterGet(itemList);
		return itemList;
	}

	public void beforeSave(ReResourceGroup entity) throws LocalizedException {
		// before save operations by entity
	}

	public void beforeDelete(String id) throws LocalizedException {
		// before delete operations by id
	}

	public void beforeDelete(ReResourceGroup entity) throws LocalizedException {
		// before delete operations by entity
	}

	public void afterGet(List<ReResourceGroup> itemList) throws LocalizedException {
		// after get operations by itemList
	}

	public void afterDeleteByLogic(String id) throws LocalizedException {
		// after delete operations by id
	}

}
