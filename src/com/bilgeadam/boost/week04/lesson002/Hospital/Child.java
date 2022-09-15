package com.bilgeadam.boost.week04.lesson002.Hospital;

import java.util.Scanner;

public class Child extends Person {

	
	@Override
	
	void vaccine() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have a measles vaccine?  (Y/N) ");
		String answer = sc.nextLine();
		
		if (answer.equalsIgnoreCase("Y")) {
			System.out.println("Great!! You have a measles vaccine! See you at the next inspection");
		}else {
			System.out.println("Please get measles vaccinated");
		}
		sc.close();
		
	

	
	}

}
