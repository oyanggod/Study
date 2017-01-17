package com.oy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oy.dao.UserDao;
import com.oy.entity.User;
import com.oy.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	public User getUserById(String userId) {
		User user = userDao.getUserById(userId);
		return user;
	}

	public List<User> getAllUsers() {
		List<User> users = userDao.getAllUsers();
		return users;
	}

}
