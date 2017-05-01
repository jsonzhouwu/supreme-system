package com.lin.service;

import java.util.List;

import com.lin.domain.User;

public interface UserService {
	
	 User selectUserById(String userId);  
	 
	 List<User > selectUserAll();

}
