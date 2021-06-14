package com.ms.assessment.Service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.assessment.Entity.User_Mcq;
import com.ms.assessment.Repository.IUser_McqRepository;
import com.ms.assessment.Service.IUser_McqService;

@Service
public class User_McqService implements IUser_McqService {

	
	@Autowired
	IUser_McqRepository user_mcqRepository;
	

	public User_Mcq saveUserMcq(User_Mcq usermcq) {
		// TODO Auto-generated method stub
        User_Mcq um = new User_Mcq();
//		um.setMcq(usermcq.getMcq());
//		um.setUser(usermcq.getUser());
//		um.setScore(usermcq.getScore());
		usermcq.setAttemptedOn(new Date(System.currentTimeMillis()));
		return user_mcqRepository.save(usermcq);
		//return um;
	}


	@Override
	public List<User_Mcq> getMcqByUser(long userId) {
		// TODO Auto-generated method stub
		return user_mcqRepository.findByUserId(userId);
	}


	@Override
	public List<User_Mcq> getAllUserMcq() {
		// TODO Auto-generated method stub
		return user_mcqRepository.findAll();
	}

}
