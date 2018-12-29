package com.lbs.re.data.repository;

import com.lbs.re.model.Project;

import java.util.List;

public interface ProjectRepository extends BaseRepository<Project, Integer>{
    List<Project> findByprojectNameLikeIgnoreCase(String nameFilter);
}