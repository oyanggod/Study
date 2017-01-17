package com.oy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.oy.entity.User;

@Repository
public interface UserDao {
	int insertUser(User user);
	User getUserById(String id);
	List<User> getAllUsers();
}
