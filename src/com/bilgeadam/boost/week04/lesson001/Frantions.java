package com.bilgeadam.boost.week04.lesson001;

import java.util.Scanner;

public class Frantions {
	private Scanner sc;
	private int selection;

	public static void main(String[] args) {
	
	
		 prosess();
		
		
		
	}


	


	private static void prosess() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter first fraction of numerator: ");
		int num1  =sc.nextInt();
		System.out.println("please enter first fraction of denominator: ");
		int denom1 = sc.nextInt();
		
		System.out.println("please enter second fraction of numerator: ");
		int num2 = sc.nextInt();
		System.out.println("please enter second fraction of denominator: ");
		int denom2 = sc.nextInt();
		System.out.println("your frantions: " + num1 + "/" + denom1 + "\t"+ num2 + "/" + denom2);
		System.out.println("please enter your (+/-/*/%) prosess: ");
		System.out.println("1 for addition");
		System.out.println("2 for subtraction");
		System.out.println("3 for multiply");
		System.out.println("4 for division");
		int selection = sc.nextInt();
		sc.close();
	
		
			
			if (selection == 1 || selection == 2) {
			       if(denom1 == denom2 ) {
			    	   if (selection == 1) {
				       int totalNum = num1 + num2;
				       System.out.println("your frantions sub is: " + totalNum +"/"+ denom1);
			    	   }else{
			    		   int totalSub = num1 - num2;
					     System.out.println("your frantions sub is: " + totalSub +"/"+ denom1);
			    	   }
			       } else {
				
				      int numTotal = num1*denom2 + num2 * denom1;
				      int denomTotal = denom1 * denom2;
				      if (selection == 1) {
				      System.out.println("your frantions sub is: " + numTotal +"/" + denomTotal );
				      }else {
				      int subTotal = num1*denom2 - num2 * denom1;
				      System.out.println("your frantions sub is: " + subTotal +"/" + denomTotal );
				      }
			       }
			} 
			else if(selection == 3) {
			      int multiply1 = num1 * num2;
				  int multiply2 = denom1 * denom2;
				     System.out.println(multiply1 + "/" + multiply2);
			       } 
				  
		    else if (selection == 4) {  
			      int division1 = num1 * denom2;
			      int division2 = denom1 * num2;
			      System.out.println(division1 + "/" + division2);
			       } 
				
			else {
				  System.err.println("wrong! please try entry!");
			       }

		
		
		
     
			
	}	
}    	


	




