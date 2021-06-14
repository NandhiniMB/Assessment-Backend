package com.ms.assessment.test.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ms.assessment.Controller.CourseController;
import com.ms.assessment.Entity.Course;
import com.ms.assessment.Service.ICourseService;

@ExtendWith(MockitoExtension.class)
public class CourseControllerTest {
	
	
	@Mock
	ICourseService courseService;
	
	@InjectMocks
	CourseController courseController;
	
	 @Test
	    public void func() throws Exception {
		 
		 Course c1= new Course();
		 c1.setId(new Long(1));
		 c1.setName("Angular");
		 c1.setDescription("Angular Basics");
		 
		 Course c2= new Course();
		 c1.setId(new Long(2));
		 c1.setName("React");
		 c1.setDescription("React Basics");
		 
		 
		 List<Course> courses = new ArrayList<Course>();
		 courses.add(c1);
		 courses.add(c2);
		 
		 Mockito.when(courseService.getAllCourse()).thenReturn(courses);
		 
		 List<Course> checkList = courseService.getAllCourse();
		  assertEquals(checkList,courses);
//	        System.out.println(checkList + courses);
		 
	 }
	
	

}
