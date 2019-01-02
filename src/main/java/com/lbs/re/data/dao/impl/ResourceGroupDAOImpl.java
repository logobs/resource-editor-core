package com.lbs.re.data.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.ResourceGroupDAO;
import com.lbs.re.data.repository.ResourceGroupRepository;
import com.lbs.re.exception.localized.GeneralLocalizedException;
import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.exception.localized.UniqueConstraintException;
import com.lbs.re.model.ReResourceGroup;

@Component
public class ResourceGroupDAOImpl implements ResourceGroupDAO<ReResourceGroup, String> {

	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private transient ResourceGroupRepository repository;

	@Autowired
	public void setRepository(ResourceGroupRepository repository) {
		this.repository = repository;
	}

	@Override
	public ReResourceGroup getById(String id) throws LocalizedException {
		try {
			return repository.findOne(id);
		} catch (Exception e) {
			throw new GeneralLocalizedException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public ReResourceGroup save(ReResourceGroup entity) throws LocalizedException {
		try {
			ReResourceGroup savedAndFlush = repository.saveAndFlush(entity);
			ReResourceGroup object = getById(savedAndFlush.getID());
			return object;
		} catch (DataIntegrityViolationException e) {
			throw new UniqueConstraintException(e);
		} catch (Exception e) {
			throw new GeneralLocalizedException(e);
		}
	}

	@Override
	public List<ReResourceGroup> save(List<ReResourceGroup> entityList) throws LocalizedException {
		try {
			List<ReResourceGroup> savedEntityList = repository.save(entityList);
			return savedEntityList;
		} catch (Exception e) {
			throw new GeneralLocalizedException(e);
		}
	}

	@Override
	public void delete(ReResourceGroup entity) throws LocalizedException {
		try {
			repository.delete(entity);
		} catch (Exception e) {
			throw new GeneralLocalizedException(e);
		}
	}

	@Override
	public void deleteById(String id) throws LocalizedException {
		try {
			repository.delete(id);
		} catch (Exception e) {
			throw new GeneralLocalizedException(e);
		}
	}

	@Override
	public List<ReResourceGroup> getAll() throws LocalizedException {
		try {
			return repository.findAll();
		} catch (Exception e) {
			throw new GeneralLocalizedException(e);
		}
	}
}
