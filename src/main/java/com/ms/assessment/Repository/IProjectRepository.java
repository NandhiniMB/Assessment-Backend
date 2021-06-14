package com.ms.assessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.assessment.Entity.Project;

public interface IProjectRepository extends JpaRepository<Project,Integer> {

}
