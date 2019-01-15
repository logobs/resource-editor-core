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

package com.lbs.re.data.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.model.ReOperation;
import com.lbs.re.model.ReUser;


@Service
public interface REUserService extends BaseService<ReUser, Integer> {

	public ReUser getUserListByUsername(String userName);

	public List<ReOperation> getUserOperationList(Integer userId) throws LocalizedException;
}
