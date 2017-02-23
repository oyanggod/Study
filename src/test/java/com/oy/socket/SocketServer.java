package com.oy.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer extends Thread {
	private ServerSocket serverSocket;

	public SocketServer(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(20000);
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept();
				System.out.println("Just connected to " + serverSocket.getLocalSocketAddress());

				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());

				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!");
				
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		SocketServer server;
		try {
			server = new SocketServer(8888);
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
