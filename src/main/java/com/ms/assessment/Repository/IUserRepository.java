package com.ms.assessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.assessment.Entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	   
	public User findByEmail(String email);
  
}

