package com.lbs.re.data.dao.impl;

import com.lbs.re.data.dao.HelpDocsDAO;
import com.lbs.re.data.repository.HelpDocsRepository;
import com.lbs.re.model.ReHelpDocs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelpDocsDAOImpl extends BaseDAOImpl<ReHelpDocs, Integer> implements HelpDocsDAO {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private transient HelpDocsRepository repository;

    @Autowired
    public void setRepository(HelpDocsRepository repository) {
        this.repository = repository;
        super.setRepository(repository);
    }

    @Override
    public List<ReHelpDocs> getHelpDocsListByNameLike(String docnameFilter) {
        return repository.findByDocnameLikeIgnoreCase(docnameFilter);
    }

    @Override
    public List<ReHelpDocs> getHelpDocsListByTitleLike(String doctitleFilter) {
        return repository.findByDoctitleLikeIgnoreCase(doctitleFilter);
    }
}
