package com.lbs.re.data.dao;

import com.lbs.re.model.Project;

import java.util.List;

public interface ProjectDAO extends BaseDAO<Project, Integer>{
    List<Project> getProjectListByNameLike(String nameFilter);
}