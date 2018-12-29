package com.lbs.re.data.service.impl;

import com.lbs.re.data.dao.MessageDAO;
import com.lbs.re.data.service.MessageService;
import com.lbs.re.model.ReMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl extends BaseServiceImpl<ReMessage, Integer> implements MessageService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private MessageDAO dao;

    @Autowired
    public void setDao(MessageDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }

    @Override
    public List<ReMessage> getMessageListByConsIdLike(String consIdFilter) {
        return dao.getMessageListByConsIdLike(consIdFilter);
    }

    @Override
    public List<ReMessage> getMessageListByModuleLike(String moduleFilter) {
        return dao.getMessageListByModuleLike(moduleFilter);
    }
}
