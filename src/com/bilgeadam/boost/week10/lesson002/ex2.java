package com.bilgeadam.boost.week10.lesson002;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		String password = "12345";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your password");
		String userPassword = scan.nextLine();
		
		if (password.equalsIgnoreCase(userPassword)) {
			
			System.out.println("Login successful");
		}else {
			System.err.println("Wrong entry");
		}
				
		scan.close();
	}

}
