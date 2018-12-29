package com.lbs.re.data.service.language;

import com.lbs.re.data.service.BaseService;
import com.lbs.re.model.languages.ReTurkishtr;
import org.springframework.stereotype.Service;

@Service
public interface TurkishtrService extends BaseService<ReTurkishtr, Integer> {
    ReTurkishtr getTurkishtrByResourceitem(Integer resourceitemref);
}
