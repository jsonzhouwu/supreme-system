package com.lin.dao;

import java.util.List;

import com.lin.domain.User;

public interface UserDao {
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public User selectUserById(String userId);  
	
	/**
	 * 
	 * @return
	 */
	public List<User> selectUserAll();

}
