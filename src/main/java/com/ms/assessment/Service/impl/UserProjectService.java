package com.ms.assessment.Service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.assessment.Entity.User_Project;
import com.ms.assessment.Repository.IUserProjectRepository;
import com.ms.assessment.Service.IUserProjectService;

@Service
public class UserProjectService implements IUserProjectService{

	@Autowired
	private IUserProjectRepository userProjectRepository;
	
	@Override
	public List<User_Project> getUserProject() {
		
		return userProjectRepository.findAll();
	}

	@Override
	public User_Project saveUserProject(User_Project userProject) {
		// TODO Auto-generated method stub
		userProject.setSubmittedOn(new Date(System.currentTimeMillis()));
		return userProjectRepository.save(userProject);
	}

}
