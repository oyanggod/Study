package com.oy.service;

import java.util.List;

import com.oy.entity.User;

public interface UserService {
	void insertUser(User user);
	User getUserById(String userId);
	List<User> getAllUsers();
}
