package com.ms.assessment.Service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.assessment.Entity.User;
import com.ms.assessment.Repository.IUserRepository;
import com.ms.assessment.Service.IUserService;

@Service
public class UserService implements IUserService {
	@Autowired
    private IUserRepository userRepository;


	public User saveUser(User user) throws Exception{
		String tempEmail = user.getEmail();

        // Check if null or empty
        if(tempEmail != null && !"".equals(tempEmail)){

            // Check if no user found with entered emailId
            if(fetchUserByEmailId(tempEmail) != null){
                throw new Exception("User with "+ tempEmail +" already exists!");
            }
        }
        user.setCreatedOn(new Date(System.currentTimeMillis()));
	        return userRepository.save(user);
	    }

	public User fetchUserByEmailId(String email){
	        return userRepository.findByEmail(email);
	    }

}
