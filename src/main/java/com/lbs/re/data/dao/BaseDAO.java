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

package com.lbs.re.data.dao;

import com.lbs.re.exception.localized.LocalizedException;
import com.lbs.re.model.AbstractBaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T extends AbstractBaseEntity, ID extends Serializable> extends Serializable {

    T getById(ID id) throws LocalizedException;

    T save(T entity) throws LocalizedException;

    List<T> save(List<T> entityList) throws LocalizedException;

    void delete(T entity) throws LocalizedException;

    void deleteById(ID id) throws LocalizedException;

    List<T> getAll() throws LocalizedException;

}
