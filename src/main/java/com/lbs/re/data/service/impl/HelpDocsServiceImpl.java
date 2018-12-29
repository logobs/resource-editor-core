package com.lbs.re.data.service.impl;

import com.lbs.re.data.dao.HelpDocsDAO;
import com.lbs.re.data.service.HelpDocsService;
import com.lbs.re.model.ReHelpDocs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelpDocsServiceImpl extends BaseServiceImpl<ReHelpDocs, Integer> implements HelpDocsService {
    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private HelpDocsDAO dao;

    @Autowired
    public void setDao(HelpDocsDAO dao) {
        this.dao = dao;
        super.setBaseDao(dao);
    }

    @Override
    public List<ReHelpDocs> getHelpDocsListByNameLike(String docnameFilter) {
        return dao.getHelpDocsListByNameLike(docnameFilter);
    }

    @Override
    public List<ReHelpDocs> getHelpDocsListByTitleLike(String doctitleFilter) {
        return dao.getHelpDocsListByTitleLike(doctitleFilter);
    }
}
