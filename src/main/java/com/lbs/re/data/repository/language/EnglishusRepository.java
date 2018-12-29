package com.lbs.re.data.repository.language;

import com.lbs.re.data.repository.BaseRepository;
import com.lbs.re.model.languages.ReEnglishus;

public interface EnglishusRepository extends BaseRepository<ReEnglishus, Integer> {
    ReEnglishus findByresourceitemref(Integer resourceitemref);
}