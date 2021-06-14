package com.ms.assessment.Service;

import com.ms.assessment.Entity.User;

public interface IUserService {

	public User saveUser(User user)throws Exception;
	public User fetchUserByEmailId(String email);
}
