package com.bilgeadam.boost.week05.lesson004.iostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStremExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("Outout.txt");
			
			BufferedInputStream input = new BufferedInputStream(file);
			
			int i;
			
			do {
				
			    i=input.read();
				System.out.print((char)i);
			}
			while(i != -1) ;
			
			input.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
