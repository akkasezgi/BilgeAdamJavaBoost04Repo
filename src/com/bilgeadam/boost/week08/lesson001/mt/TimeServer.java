package com.bilgeadam.boost.week08.lesson001.mt;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {

	public static void main(String[] args) {
		System.out.println("Sunucu calisti");
		int port = 4711;
		

		try (ServerSocket serverSocket = new ServerSocket( port)) {
			Socket clientSocket = serverSocket.accept();
			System.out.println(clientSocket + "port'u üzerinden istemci ile iletişim kuruldu");
			
			OutputStream os = clientSocket.getOutputStream();
			PrintWriter sender = new PrintWriter(os,true);
		
		while(true) {
			sender.println(LocalDateTime.now());
			Thread.sleep(3000);
		}
		
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("sunucu durdu");
	}

}
