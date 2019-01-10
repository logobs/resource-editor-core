package com.lbs.re.data.repository;

import com.lbs.re.data.unscan.BaseRepository;
import com.lbs.re.model.ReHelpDocs;

import java.util.List;

public interface HelpDocsRepository extends BaseRepository<ReHelpDocs, Integer> {
    List<ReHelpDocs> findByDocnameLikeIgnoreCase(String docnameFilter);
    List<ReHelpDocs> findByDoctitleLikeIgnoreCase(String doctitleFilter);
}
