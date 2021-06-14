package com.ms.assessment.Controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.assessment.Entity.User;
import com.ms.assessment.Service.IUserService;

@RestController
public class UserController {

	@Autowired
    private IUserService userService;

	    @PostMapping("/register")
	    @CrossOrigin(origins = "http://localhost:4200")
	    public User registerUser(@RequestBody User user) throws Exception{
	    	return userService.saveUser(user);
	    }

	    @PostMapping("/login")
	    @CrossOrigin(origins = "http://localhost:4200")
	    public User loginUser(@RequestBody User user) throws Exception{
	        String tempEmail = user.getEmail();
	        String tempPassword = user.getPassword();
	        User userCheck = null;

	        // Check if null or empty
	        if(tempEmail != null && !"".equals(tempEmail)){
	            userCheck = userService.fetchUserByEmailId(tempEmail);

	            // Check if no user found with entered emailId
	            if(userCheck != null){

	                // Check Email-Password Match
	                if(!(userCheck.getPassword()).equals(tempPassword)){
	                    throw new Exception("Username and Passwords do not match");
	                }
	            }
	            else{
	                throw new Exception("Your Email Id is not registered :(");
	            }
	        }
	        return userCheck;
	    }
	    
	    @Value("${admins}")
		private String adminString;
		
		public Set<String> getAllAdmin(){
			System.out.println("adminstring"+adminString);
			if(adminString != null) {
				return new HashSet<>(Arrays.asList(adminString.split(",")));
			}
			return new HashSet<String>();
		}


	    
}
