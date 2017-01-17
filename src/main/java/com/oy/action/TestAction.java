package com.oy.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.oy.entity.User;
import com.oy.service.UserService;

@Controller
@RequestMapping(value = "/Hello")
public class TestAction {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/World")
	public String sayHelloWorld() {
		return "hello";
	}

	@RequestMapping(value = "/getUserById", method = RequestMethod.GET)
	public ModelAndView getUserById(@RequestParam(value = "userId") String userId){
		ModelAndView mv = new ModelAndView("user");
		User user = userService.getUserById(userId);
		//sss
		mv.addObject(user);
		return mv;
	}
}
