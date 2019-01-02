package com.lbs.re.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lbs.re.model.ReResourceGroup;

@Repository
public interface ResourceGroupRepository extends JpaRepository<ReResourceGroup, String> {

}
