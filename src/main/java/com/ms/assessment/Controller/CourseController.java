package com.ms.assessment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.assessment.Entity.Course;
import com.ms.assessment.Service.ICourseService;

@RestController
public class CourseController {

	@Autowired
	ICourseService courseService;
	
	@GetMapping("/course")
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
	}
}
