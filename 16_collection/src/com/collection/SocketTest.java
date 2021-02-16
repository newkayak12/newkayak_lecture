package com.collection;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {

	public static void main(String[] args) {
		String ip = "";
		
		try {
			Socket socket = new Socket(ip, 8080);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			ip = "192.168.0.5";
			try {
				Socket socket = new Socket(ip, 8080);
					System.out.println(socket.getInetAddress());
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
