package _02_Chat_Application;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	String ip;
	int port;
	Client(String ip,int port) {
		this.ip = ip;
		this.port = port;
	}
	public void Start() {
		try {
			Socket connection = new Socket(ip,port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
