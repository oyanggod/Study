package com.oy.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.oy.entity.User;
import com.oy.service.UserService;

@Controller
@RequestMapping(value = "/httpInter")
public class TestAction {
	private static final Logger logger = LoggerFactory.getLogger(TestAction.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/httpInter_hello")
	public String sayHelloWorld() {
//		for (int i = 0; i < 10000; i++) {
			logger.debug("debug...");
			logger.info("info...");
			logger.warn("warn...");
			logger.error("error...");
//		}
		return "hello";
	}

	@RequestMapping(value = "/getUserById", method = RequestMethod.GET)
	public ModelAndView getUserById(@RequestParam(value = "userId") String userId){
		ModelAndView mv = new ModelAndView("user");
		User user = userService.getUserById(userId);
		mv.addObject(user);
		return mv;
	}
}
