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

import com.ms.assessment.Entity.MCQ;
import com.ms.assessment.Entity.Question;
import com.ms.assessment.RequestBody.McqQuestionWrap;
import com.ms.assessment.Service.IMCQService;
import com.ms.assessment.Service.IQuestionService;

@RestController
@RequestMapping("mcq")
public class MCQController {

	@Autowired
	IMCQService mcqService;
	
	@Autowired
	IQuestionService questionService;
	
	@PostMapping("/save")
	public MCQ saveMCQ(@RequestBody McqQuestionWrap body) {
		
		System.out.println(body);
		MCQ mcq_obj=body.getMcq();
		List<Question> questions = body.getQuestions();
		MCQ mcq=mcqService.saveMCQ(mcq_obj);
		System.out.println(mcq);
		questions.stream().forEach(question -> { 
		System.out.println(question);
		questionService.saveQuestions(question,mcq);
		});
		return mcq_obj;
	}
		
	@GetMapping("/")
	public List<MCQ> findAllMCQ(){
		System.out.println("here");
//		List<MCQ> res= mcqService.getMCQ();
//		res.stream().forEach( r -> System.out.println(r));
		return mcqService.getMCQ();
	}
	
	@GetMapping("/quest/{id}")
	public List<Question> findMCQQuestions(@PathVariable int id){
		return mcqService.findQuestions(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMCQ(@PathVariable int id) {
	 mcqService.deleteMCQ(id);
	}
	
	
	
}
