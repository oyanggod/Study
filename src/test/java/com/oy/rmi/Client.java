package com.oy.rmi;

import java.rmi.Naming;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		try {
			// 包名要相同
			// 调用远程对象，注意RMI路径与接口必须与服务器配置一致
			PersonService personService = (PersonService) Naming.lookup("rmi://192.168.1.152:6600/PersonService");
			List<Person> personList = personService.getList();
			for (Person person : personList) {
				System.out.println("ID:" + person.getId() + " Age:" + person.getAge() + " Name:" + person.getName());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}