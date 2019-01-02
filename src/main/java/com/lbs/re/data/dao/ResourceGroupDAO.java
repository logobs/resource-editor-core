package com.lbs.re.data.dao;

import java.io.Serializable;
import java.util.List;

import com.lbs.re.exception.localized.LocalizedException;

public interface ResourceGroupDAO<ReResourceGroup, String> extends Serializable {
	ReResourceGroup getById(String id) throws LocalizedException;

	ReResourceGroup save(ReResourceGroup entity) throws LocalizedException;

	List<ReResourceGroup> save(List<ReResourceGroup> entityList) throws LocalizedException;

	void delete(ReResourceGroup entity) throws LocalizedException;

	void deleteById(String id) throws LocalizedException;

	List<ReResourceGroup> getAll() throws LocalizedException;
}
