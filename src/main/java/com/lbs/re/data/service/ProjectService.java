package com.lbs.re.data.service;

import com.lbs.re.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService extends BaseService<Project, Integer> {
    List<Project> getProjectListByNameLike(String nameFilter);
}
