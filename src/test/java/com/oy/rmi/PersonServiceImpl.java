package com.oy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

//此为远程对象的实现类，须继承UnicastRemoteObject
public class PersonServiceImpl extends UnicastRemoteObject implements PersonService {
	private static final long serialVersionUID = 1L;

	protected PersonServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public List<Person> getList() throws RemoteException {
		System.out.println("get persion start");
		List<Person> list = new LinkedList<Person>();
		
		Person p1 = new Person();
		p1.setId(0);
		p1.setName("xiaoqiang");
		p1.setAge(20);
		
		Person p2 = new Person();
		p2.setId(1);
		p2.setName("xiaohong");
		p2.setAge(30);
		
		list.add(p1);
		list.add(p2);
		return list;
	}
	
	

}
