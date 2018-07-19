package com.lin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lin.dao.UserDao;
import com.lin.domain.User;
import com.lin.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired 
	private UserDao userDao;

	public User selectUserById(String userId) {
		// TODO Auto-generated method stub zhouwu zhouwu  0719-1
		return userDao.selectUserById(userId);
	}

	public List<User> selectUserAll() {
		// TODO Auto-generated method stub
		return userDao.selectUserAll();
	}

	

}
