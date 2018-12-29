package com.lbs.re.data.dao.impl;

import com.lbs.re.data.dao.MessageDAO;
import com.lbs.re.data.repository.MessageRepository;
import com.lbs.re.model.ReMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageDAOImpl extends BaseDAOImpl<ReMessage, Integer> implements MessageDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient MessageRepository repository;

    @Autowired
    public void setRepository(MessageRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }

    @Override
    public List<ReMessage> getMessageListByConsIdLike(String consIdFilter) {
        return repository.findByConsIdLikeIgnoreCase(consIdFilter);
    }

    @Override
    public List<ReMessage> getMessageListByModuleLike(String moduleFilter) {
        return repository.findByModuleLikeIgnoreCase(moduleFilter);
    }
}
