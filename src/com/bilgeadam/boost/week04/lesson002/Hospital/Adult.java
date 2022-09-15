package com.bilgeadam.boost.week04.lesson002.Hospital;

import java.util.Scanner;

public class Adult extends Person {
	


	@Override
	
	void vaccine() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have a covid vaccine?  (Y/N) ");
		String answer = sc.nextLine();
		
		if (answer.equalsIgnoreCase("Y")) {
			System.out.println("Great!! You have a covid vaccine! See you at the next inspection");
		}else {
			System.out.println("Please get covid vaccinated");
		}
		sc.close();
	}


	

}
