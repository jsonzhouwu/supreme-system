package com.lin.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lin.baseTest.SpringTestCase;
import com.lin.domain.User;

public class UserServiceTest extends SpringTestCase {

	    @Autowired 
	    private UserService userService;  
	    Logger logger = Logger.getLogger(UserServiceTest.class);  
	      
	    @Test 
	    public void selectUserByIdTest(){  
	       try {
	    	    List<User> list=userService.selectUserAll();
		        System.out.println(list.size());
		        logger.debug("²éÕÒ½á¹û" + list);  
		} catch (Exception e) {
			e.printStackTrace();
		}
	    }  
}
