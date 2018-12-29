package com.lbs.re.data.dao.language;

import com.lbs.re.data.dao.BaseDAO;
import com.lbs.re.model.languages.ReEnglishus;

public interface EnglishusDAO extends BaseDAO<ReEnglishus, Integer> {
    ReEnglishus getEnglishusByResourceitem(Integer resourceitemref);
}
