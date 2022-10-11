package com.bilgeadam.boost.week08.lesson001.mt;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

        System.out.println("Sunucu calisti");
		int port = 4711;
		
		try {
			ServerSocket serverSocket = new ServerSocket(port); // Sunucunun gelen istekleri beklediği kapıyı tanımlıyoruz
	        Socket clientSocket = serverSocket.accept();
	        System.out.println("Sunucu ile baglanti kuruldu");
		} catch (IOException e) {
		
			e.printStackTrace();
		}

		System.out.println("Sunucu durdu");
	}

}
