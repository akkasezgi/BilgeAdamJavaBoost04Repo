package com.bilgeadam.boost.week04.lesson002.Hospital;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Child c1 = new Child ();
		Adult a1 = new Adult ();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name: ");
		String name = sc.nextLine();
		System.out.println("please enter your age: ");
		int age = sc.nextInt();
	    sc.nextLine();
		System.out.println("you are healty? (y/n) ");
		String healty = sc.nextLine();
		 
		
		
		c1.vaccine();
		
		

		
	}

}
