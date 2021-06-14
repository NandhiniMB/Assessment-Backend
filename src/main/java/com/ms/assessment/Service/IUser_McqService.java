package com.ms.assessment.Service;

import java.util.List;

import com.ms.assessment.Entity.User_Mcq;

public interface IUser_McqService {

	User_Mcq saveUserMcq(User_Mcq usermcq);

	List<User_Mcq> getMcqByUser(long userId);

	List<User_Mcq> getAllUserMcq();

}
