package com.lbs.re.data.dao.language;

import com.lbs.re.data.dao.BaseDAO;
import com.lbs.re.model.languages.ReTurkishtr;

public interface TurkishtrDAO extends BaseDAO<ReTurkishtr, Integer> {
    ReTurkishtr getTurkishtrByResourceitem(Integer resourceitemref);
}
