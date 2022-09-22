package com.bilgeadam.boost.week05.lesson003.Exceptions;
import java.lang.*;
public class ExceptionHandling {

	public static void main(String[] args) {



		
		try {
			
			Integer myInt = Integer.parseInt("5a");
			
		} catch (Exception e) {
			
			System.out.println("Stop trying convert a text to a number.");
		
		}finally {
			System.out.println("finally block....");
		}
		
		System.out.println("Code continues....");
	}

}
