package com.bilgeadam.boost.week05.lesson004.iostream;

import java.io.FileInputStream;


import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {

//		byte [] array = new byte [100];

		try {
			InputStream input = new FileInputStream("Output.txt");
			input.available();
			
			System.out.println("Available bytes in the file: "  + input.available());
			byte [] array = new byte[input.available()];
			
			input.skip(5);
			
			input.read(array);
			
			String data = new String(array);
			System.out.println(data);
			

		} catch (Exception e) {

			
		}

	}

}
