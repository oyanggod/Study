package com.oy;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class Test extends HttpServletRequestWrapper{
	private Map<String, String[]> params = new HashMap<String, String[]>();
	
	public Test(HttpServletRequest request) {
		super(request);
		this.params.putAll(request.getParameterMap());
	}

	public Test(HttpServletRequest request, Map<String, String[]> params) {
		super(request);
		this.params = params;
	}
	
	
	
}
