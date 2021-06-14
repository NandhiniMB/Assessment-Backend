package com.ms.assessment.Service;

import java.util.List;

import com.ms.assessment.Entity.User_Project;

public interface IUserProjectService {

	List<User_Project> getUserProject();

	User_Project saveUserProject(User_Project userProject);

}
