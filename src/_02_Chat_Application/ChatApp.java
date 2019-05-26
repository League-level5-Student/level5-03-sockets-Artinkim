package _02_Chat_Application;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import _01_Intro_To_Sockets.server.ServerGreeter;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp extends JFrame {
	public static void main(String[] args) {
		new ChatApp();
	}
	ChatApp() {
		int response = JOptionPane.showConfirmDialog(null, "Would you like to host a connection?", "Buttons!", JOptionPane.YES_NO_OPTION);
		if(response == JOptionPane.YES_OPTION) {
			try {
				JOptionPane.showMessageDialog(null, "Server started at: "+"Port: 8080");
				JPanel p = new JPanel();
				setTitle("Server");
				JTextField tf = new JTextField();
				p.add(tf);
				p.add(new JButton->{
					
					
				});
				pack();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {
			setTitle("Client");
			
		}
	}
}
