package com.ms.assessment.Service;

import java.util.List;

import com.ms.assessment.Entity.Project;

public interface IProjectService {

	public Project saveProject(Project project);

	public List<Project> getAllProjects();

	public void deleteProject(int id);

}
