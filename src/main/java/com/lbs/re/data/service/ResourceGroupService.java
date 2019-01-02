package com.lbs.re.data.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.model.ReResourceGroup;

@Service
public interface ResourceGroupService {
	ReResourceGroup getById(String id) throws LocalizedException;

	ReResourceGroup save(ReResourceGroup entity) throws LocalizedException;

	List<ReResourceGroup> save(List<ReResourceGroup> entityList) throws LocalizedException;

	void delete(ReResourceGroup entity) throws LocalizedException;

	void deleteById(String id) throws LocalizedException;

	List<ReResourceGroup> getAll() throws LocalizedException;

}
