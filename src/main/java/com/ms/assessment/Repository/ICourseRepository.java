package com.ms.assessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.assessment.Entity.Course;


public interface ICourseRepository extends JpaRepository<Course, Long> { 
	

}
