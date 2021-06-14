package com.ms.assessment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.assessment.Entity.Project;
import com.ms.assessment.Service.IProjectService;

@RestController
@RequestMapping("project")
public class ProjectController {
	
	@Autowired
	IProjectService projectService;
	
	@PostMapping
	public Project createProject(@RequestBody Project project)
	{
		return projectService.saveProject(project);
		
	}
	
	@GetMapping
	public List<Project> getAllProjects(){
		return projectService.getAllProjects();
	}
	
	@DeleteMapping("/{id}")
	public void deleteProject(@PathVariable int id){
		projectService.deleteProject(id);
	}

}
