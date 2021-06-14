package com.ms.assessment.Service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.assessment.Entity.Project;
import com.ms.assessment.Repository.IProjectRepository;
import com.ms.assessment.Service.IProjectService;

@Service
public class ProjectService implements IProjectService{

	
	
	@Autowired
	IProjectRepository projectRepository;
	public Project saveProject(Project project) {
		// TODO Auto-generated method stub
		project.setCreatedOn(new Date(System.currentTimeMillis()));
		return projectRepository.save(project);
	}
	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}
	public void deleteProject(int id) {
		// TODO Auto-generated method stub
		projectRepository.deleteById(id);
		
	}

}
