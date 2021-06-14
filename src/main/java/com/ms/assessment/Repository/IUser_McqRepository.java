package com.ms.assessment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.assessment.Entity.User_Mcq;

public interface IUser_McqRepository extends JpaRepository<User_Mcq,Integer>{

	List<User_Mcq> findByUserId(long userId);

	
	

}
