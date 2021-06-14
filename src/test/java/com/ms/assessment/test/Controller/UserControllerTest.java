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

import com.ms.assessment.Controller.UserController;
import com.ms.assessment.Entity.User;
import com.ms.assessment.Service.IUserService;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

	    @Mock
	    private IUserService userService;

	    @InjectMocks
	    private  UserController  userController;

	    @Before
	    public void init() throws Exception {
	       MockitoAnnotations.initMocks(this);
	    }

	    @Test
	    public void func() throws Exception {

	        User user=new User();
	        user.setUserName("nandhinimb");
	        user.setEmail("nandhini.mb@accolitedigital.com");
	        user.setId(new Long(1));
	        user.setPassword("omg");

	        Mockito.when(userService.fetchUserByEmailId("nandhini.mb@accolitedigital.com")).thenReturn(user);


	        //get
	        User returned=userService.fetchUserByEmailId("nandhini.mb@accolitedigital.com");
	        assertEquals(returned.getUserName(), "nandhinimb");
	        System.out.println(returned.getUserName());


	        new User();
	        user.setUserName("mohit");
	        user.setEmail("goa@panjim.com");
	        user.setId(new Long(5));
	        user.setPassword("omg");
	        Mockito.when(userService.saveUser(user)).thenReturn(user);

	        //post
	        User check=userService.saveUser(user);
	        assertEquals(check.getEmail(),"goa@panjim.com");
	        System.out.println(check.getEmail());

	    }
}
