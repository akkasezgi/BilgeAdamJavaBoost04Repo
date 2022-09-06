package com.bilgeadam.boost.week04.lesson001;

import java.util.Scanner;

public class Frantions {

	public static void main(String[] args) {
	
	
	
		prosess();
		
	}

	private static void prosess() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter first fraction of numerator: ");
		int num1  = sc.nextInt();
		System.out.println("please enter first fraction of denominator: ");
		int denom1 = sc.nextInt();
		System.out.println( num1 + "/" + denom1);
		System.out.println("please enter second fraction of numerator: ");
		int num2 = sc.nextInt();
		System.out.println("please enter second fraction of denominator: ");
		int denom2 = sc.nextInt();
		System.out.println( num2 + "/" + denom2);
		
	}

}
