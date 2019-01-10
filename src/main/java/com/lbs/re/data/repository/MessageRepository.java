package com.lbs.re.data.repository;

import com.lbs.re.data.unscan.BaseRepository;
import com.lbs.re.model.ReMessage;

import java.util.List;

public interface MessageRepository extends BaseRepository<ReMessage, Integer> {
    List<ReMessage> findByConsIdLikeIgnoreCase(String consIdFilter);
    List<ReMessage> findByModuleLikeIgnoreCase(String moduleFilter);
}
