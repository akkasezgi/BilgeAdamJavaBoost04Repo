package com.bilgeadam.boost.week02.lesson003.mt;

import  java.util.Scanner;


/*
 * @author ezgi.akkas
 * Java doc
 */

public class CurrencyCalculator {
	
	
	/*
	 * 
	 * @param args 
	 */

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Gunluk dolar kurunu giriniz: ");
		double rate = input.nextDouble();
		System.out.print("Bozdurmak istediginiz meblagi giriniz: ");
		int amount = input.nextInt();
		System.out.println("Dolar Kuru: " + rate + "bozdurulacak meblag" + amount);
		input.close();
		System.out.println(amount + "$==>" + amount*rate + "TL eder");
		
 
		/*
		 * c-like veya block comment 
		 * dfdsf
		 * fdsfds
		 * fdsfds
		 * fds
		 */
		
		System.out.println(amount + "$ ==> " + amount*rate + "TL eder"); // inline comment
		System.out.println(amount + "TL ==> " + amount/rate + "$ eder");
		
		input.close();
		
		{
			int a, b/*, notNeeded*/;
			b=0;
			a = b;
		}
		{
			// boş blok
		}

	}

}