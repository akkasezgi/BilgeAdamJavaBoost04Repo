package com.bilgeadam.boost.week07.lesson001;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	private Socket socket;
	private DataInputStream input;
	private DataOutputStream output;
	
	
	public Client(String address, int port) {
		
		try {
			socket = new Socket(address, port);
			System.out.println("connected");
			
			input = new DataInputStream(System.in);
			output = new DataOutputstream(socket.getOutputStream());
			
			String line = input.readLine();
			output.writeUTF(line);
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}finally {
			
		}try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		input.close();
		output.close();
		socket.close();
	}


	public static void main(String[] args) {
		
		Client client = new Client("192.168.1.104", 3333);
	}
	

}
