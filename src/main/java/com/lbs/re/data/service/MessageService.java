package com.lbs.re.data.service;

import com.lbs.re.model.ReMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService extends BaseService<ReMessage, Integer> {
    List<ReMessage> getMessageListByConsIdLike(String consIdFilter);
    List<ReMessage> getMessageListByModuleLike(String moduleFilter);
}