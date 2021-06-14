package com.ms.assessment.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.assessment.Entity.Course;
import com.ms.assessment.Repository.ICourseRepository;
import com.ms.assessment.Service.ICourseService;

@Service
public class CourseService implements ICourseService{

	@Autowired
	ICourseRepository courseRepository;
	
	public List<Course> getAllCourse() {	
		return courseRepository.findAll();
	}

}

