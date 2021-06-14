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

import com.ms.assessment.Controller.MCQController;
import com.ms.assessment.Entity.Course;
import com.ms.assessment.Entity.MCQ;
import com.ms.assessment.Service.IMCQService;

@ExtendWith(MockitoExtension.class)
public class MCQControllerTest {

	
	@Mock
	IMCQService mcqService;
	
	@InjectMocks
	MCQController mcqController;
	
	 @Test
	    public void func() throws Exception {
		 
		 
		 MCQ m1= new MCQ();
		 m1.setId(1);
		 m1.setName("Test 1");
		 
		 
		 MCQ m2= new MCQ();
		 m1.setId(2);
		 m1.setName("Test 2");
		 
		 List<MCQ> mcqList = new ArrayList<MCQ>();
		 mcqList.add(m1);
		 mcqList.add(m2);
		 
		 Mockito.when(mcqService.getMCQ()).thenReturn(mcqList);
		 
		 List<MCQ> checkList = mcqService.getMCQ();
		 assertEquals(checkList,mcqList);
		
	 }
}
