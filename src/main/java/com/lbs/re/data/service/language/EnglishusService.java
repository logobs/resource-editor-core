package com.lbs.re.data.service.language;

import com.lbs.re.data.service.BaseService;
import com.lbs.re.model.languages.ReEnglishus;
import org.springframework.stereotype.Service;

@Service
public interface EnglishusService extends BaseService<ReEnglishus, Integer> {
    ReEnglishus getEnglishusByResourceitem(Integer resourceitemref);
}
