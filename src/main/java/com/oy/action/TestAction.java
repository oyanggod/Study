package com.oy.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Hello")
public class TestAction {

	@RequestMapping(value = "/World")
	public String sayHelloWorld() {
		return "hello";
	}

}
