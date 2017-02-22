package com.oy.action;

import com.opensymphony.xwork2.ActionSupport;
import com.oy.entity.Person;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 6602023135861505439L;
	public String Name;
	public int Age;
	public Person PersonShana;

	public String getResult() {
		return Result;

	}

	public Person getPersonShana() {
		return PersonShana;
	}

	public void setPersonShana(Person personShana) {
		PersonShana = personShana;
	}

	public void setResult(String result) {
		Result = result;
	}

	public String Result;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String execute() throws Exception {
		return "success";
	}

}