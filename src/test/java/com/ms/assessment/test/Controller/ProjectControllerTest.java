package com.ms.assessment.test.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ms.assessment.Controller.ProjectController;
import com.ms.assessment.Entity.Project;
import com.ms.assessment.Service.IProjectService;

@ExtendWith(MockitoExtension.class)
public class ProjectControllerTest {

	    @Mock
	    private IProjectService projectService;

	    @InjectMocks
	    private  ProjectController  projectController;
	    
	    @Before
	    public void init() throws Exception {
	       MockitoAnnotations.initMocks(this);
	    }

	    
	    @Test
	    public void func() throws Exception {
		   

	    	Project p = new Project();
	    	p.setId(1);
	    	p.setName("Weather Application");
	    	p.setDescription("Requirements");
	    
	    	
	    	Project p1 = new Project();
	    	p1.setId(1);
	    	p1.setName("Weather Application");
	    	p1.setDescription("Requirements");
		  
	    	 Mockito.when(projectService.saveProject(p)).thenReturn(p1);
			 assertEquals(p,p1);
		 
	 }
	 }

