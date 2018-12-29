package com.lbs.re.data.dao;

import com.lbs.re.model.ReMessage;

import java.util.List;

public interface MessageDAO extends BaseDAO<ReMessage, Integer> {
    List<ReMessage> getMessageListByConsIdLike(String consIdFilter);
    List<ReMessage> getMessageListByModuleLike(String moduleFilter);
}
