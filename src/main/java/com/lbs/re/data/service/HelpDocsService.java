package com.lbs.re.data.service;

import com.lbs.re.model.ReHelpDocs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HelpDocsService extends BaseService<ReHelpDocs, Integer> {
    List<ReHelpDocs> getHelpDocsListByNameLike(String docnameFilter);
    List<ReHelpDocs> getHelpDocsListByTitleLike(String doctitleFilter);
}
