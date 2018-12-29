package com.lbs.re.data.dao;

import com.lbs.re.model.ReHelpDocs;

import java.util.List;

public interface HelpDocsDAO extends BaseDAO<ReHelpDocs, Integer> {
    List<ReHelpDocs> getHelpDocsListByNameLike(String docnameFilter);
    List<ReHelpDocs> getHelpDocsListByTitleLike(String doctitleFilter);
}
