package com.oy;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oy.entity.User;
import com.oy.service.UserService;

public class JunitTest {
	private UserService userService;
	
	@Before
	public void before(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = (UserService) context.getBean("userService");
	}
	
	@Test
	public void testInsertUser(){
		User user = new User();
		user.setUserId(UUID.randomUUID().toString().replace("-", ""));
		user.setUserName("xiaohong");
		user.setBirthday(new Date());
		user.setSalary(10000d);
		
		userService.insertUser(user);
	}
}
