package com.oy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
	public static void main(String[] args) {
		try {
			PersonService persionService = new PersonServiceImpl();
			LocateRegistry.createRegistry(6600);
			Naming.rebind("rmi://192.168.1.152:6600/PersonService", persionService);
			System.out.println("Service Start");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
