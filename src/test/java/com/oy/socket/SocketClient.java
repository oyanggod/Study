package com.oy.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	private static final String serverName = "192.168.1.152";
	private static final int port = 8888;

	public static void main(String[] args) {
		try {
			System.out.println("Connecting to " + serverName + " on port " + port);
			Socket client = new Socket(serverName, port);
			System.out.println("Just connected to " + client.getRemoteSocketAddress());

			OutputStream out = client.getOutputStream();
			DataOutputStream dataOutput = new DataOutputStream(out);
			dataOutput.writeUTF("Hello from " + client.getLocalSocketAddress());

			InputStream in = client.getInputStream();
			DataInputStream dataInput = new DataInputStream(in);
			System.out.println("Server says " + dataInput.readUTF());

			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
