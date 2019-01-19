/*
 * Copyright 2014-2019 Logo Business Solutions
 * (a.k.a. LOGO YAZILIM SAN. VE TIC. A.S)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.lbs.re.data.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbs.re.data.dao.REUserDAO;
import com.lbs.re.data.service.REUserService;
import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.model.ReOperation;
import com.lbs.re.model.ReUser;
import com.lbs.re.model.ReUserGroup;

@Service
public class REUserServiceImpl extends BaseServiceImpl<ReUser, Integer> implements REUserService {

	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private REUserDAO dao;

	@Autowired
	public void setDao(REUserDAO dao) {
		this.dao = dao;
		super.setBaseDao(dao);
	}

	@Override
	public ReUser getUserListByUsername(String userName) {
		return dao.getUserListByUsername(userName);
	}

	private List<ReOperation> getUserOperationList(Integer userId) throws LocalizedException {
		ReUser user = getById(userId);
		ReUserGroup userGroup = user.getUserGroup();
		if (userGroup == null) {
			return new ArrayList<ReOperation>();
		}
		List<ReOperation> operations = userGroup.getOperations();
		return operations;
	}

	@Override
	public boolean isUserAuth(Integer userId, String operationName) throws LocalizedException {
		List<ReOperation> operationList = getUserOperationList(userId);
		for (ReOperation operation : operationList) {
			if (operation.getOperationName().equals(operationName)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void beforeSave(ReUser entity) throws LocalizedException {
		ReUserGroup group = new ReUserGroup();
		group.setId(entity.getGeneralaccessrights().getTyp());
		entity.setUserGroup(group);
	}

}
