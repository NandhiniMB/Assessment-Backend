package com.ms.assessment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.assessment.Entity.User_Mcq;
import com.ms.assessment.Service.IUser_McqService;

@RestController
@RequestMapping("usermcq")
public class UserMcqController {

	@Autowired
	private IUser_McqService user_mcqService;
	
	@PostMapping("/") 
	private User_Mcq saveUserMcq(@RequestBody User_Mcq usermcq) {
		System.out.println("here"+usermcq);
		return user_mcqService.saveUserMcq(usermcq);
	}
	
	@GetMapping("/{userId}")
	private List<User_Mcq> getMcqByUser(@PathVariable long userId) {
		return user_mcqService.getMcqByUser(userId);
	}
	
	@GetMapping
	private List<User_Mcq> getAllUserMcq() {
		return user_mcqService.getAllUserMcq();
	}
}
