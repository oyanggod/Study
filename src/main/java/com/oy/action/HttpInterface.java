package com.oy.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component("HttpInterface")
public class HttpInterface extends ActionSupport implements Serializable {
	private static final long serialVersionUID = -2524543766555392036L;

	public String hi(){
		PrintWriter out = null;
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/xml;charset= UTF-8");
		try {
			out = response.getWriter();
			out.print("Hi");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
