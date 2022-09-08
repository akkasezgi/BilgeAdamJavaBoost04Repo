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
		
		System.out.println("please enter second fraction of numerator: ");
		int num2 = sc.nextInt();
		System.out.println("please enter second fraction of denominator: ");
		int denom2 = sc.nextInt();
		System.out.println("your frantions: " + num1 + "/" + denom1 + "\t"+ num2 + "/" + denom2);
		sc.close();
		
		if(denom1 == denom2 ) {
			int totalNum = num1 + num2;
			System.out.println("your frantions sub is: " + totalNum +"/"+ denom1);
		} else {
			
			int numTotal = num1*denom2 + num2 * denom1;
			int denomTotal = denom1 * denom2;
//			System.out.println("your frantions sub is: " + numTotal +"/" + denomTotal );
		}
		int ebob1 = 0;
		if (num1<denom1) {
			for (int i=0; i<num1; i++) {
				if (num1 % i == 0 && denom1 % i == 0) {
				 ebob1 = i;
				}
			}	
//		}else {
//			for (int i=0; i<denom1; i++) {
//				if (num1 % i == 0 && denom1 % i == 0) {
//					ebob1 = i;
//				}
//			}
//		}
//		
//			
//		int ebob2 = 0;
//		if (num2<denom2) {
//			for (int i=0; i<num2; i++) {
//				if (num2 % i == 0 && denom2 % i == 0) {
//				 ebob2 = i;
//				}
//			}	
//		}else {
//			for (int i=0; i<denom2; i++) {
//				if (num2 % i == 0 && denom2 % i == 0) {
//					ebob2 = i;
//				}
//			}
//		}
			
		System.out.println(num1/ebob1 + "/" +denom1/ebob1);
	


	}

	

}
