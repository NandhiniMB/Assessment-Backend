package com.ms.assessment.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ms.assessment.Entity.User_Project;
import com.ms.assessment.RequestBody.ProjectUpload;
import com.ms.assessment.Service.IUserProjectService;

@RestController
@RequestMapping("userproject")
public class UserProjectController {
	
	@Autowired
	private IUserProjectService userProjectService;

	@PostMapping
	public User_Project saveUserProject(@RequestPart("userProject") ProjectUpload projectUpload, @RequestPart(value = "file", required = true) MultipartFile file)
	{
		System.out.println(projectUpload + file.toString());
		User_Project up = new User_Project();
		up.setCourse(projectUpload.getCourse());
		up.setProject(projectUpload.getProject());
		up.setUser(projectUpload.getUser());
		try {
			up.setFile(file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userProjectService.saveUserProject(up);
		
	}
	
	@GetMapping
	public List<User_Project> getUserProject() {
		return userProjectService.getUserProject();
		
	}
	
	
	@PostMapping("/score")
	public User_Project saveUserProjectScore(@RequestBody User_Project up) {
		return userProjectService.saveUserProject(up);
	}
}
