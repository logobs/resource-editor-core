package com.lbs.re.data.repository.language;

import com.lbs.re.data.repository.BaseRepository;
import com.lbs.re.model.languages.ReTurkishtr;

public interface TurkishtrRepository extends BaseRepository<ReTurkishtr, Integer> {
    ReTurkishtr findByresourceitemref(Integer resourceitemref);
}