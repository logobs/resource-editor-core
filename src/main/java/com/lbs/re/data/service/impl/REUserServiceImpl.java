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

import com.lbs.re.data.dao.REUserDAO;
import com.lbs.re.data.service.REUserService;
import com.lbs.re.model.ReUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<ReUser> getUserListByUsername(String userName) {
        return dao.getUserListByUsername(userName);
    }
}
