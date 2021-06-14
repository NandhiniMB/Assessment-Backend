package com.ms.assessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.assessment.Entity.User_Project;

public interface IUserProjectRepository extends JpaRepository<User_Project,Integer> {

	User_Project save(User_Project userProject);

}
