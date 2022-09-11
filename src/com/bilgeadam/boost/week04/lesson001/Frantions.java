package com.bilgeadam.boost.week04.lesson001;

import java.util.Scanner;

public class Frantions {


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
		ebob(selection, num1, num2, denom1, denom2);
		
		sc.close();
	  }
	
	
	private static void ebob(int selection, int num1, int num2, int denom1, int denom2) {

		int temp1;
		int hcf1 = 1;
		
		if(num1>denom1) {
			temp1 = denom1;
		}else {
			temp1 = num1;
		}
		while(temp1>0) {
			if(num1%temp1==0 && denom1%temp1==0) {
				hcf1 = temp1;
				break;
			}
			temp1--;
		}		
		temp1=1;
		
		num1 = num1 / hcf1;
		denom1 = denom1 / hcf1;
//		System.out.println(num1 + "/" + denom1);
		
		
		int temp2;
		int hcf2 = 1;
		if(num2>denom2) {
			temp2 = denom2;
		}else {
			temp2 = num2;
		}
		while(temp2>0) {
			if(num2%temp2==0 && denom2%temp2==0) {
				hcf2 = temp2;
				break;
			}
			temp2--;
		}		
		temp2=1;
		
		num2 = num2 / hcf2;
		denom2 = denom2 / hcf2;
//		System.out.println(num2 + "/" + denom2);
		frantionProsess(selection, num1, num2, denom1, denom2);
	}

	
    private static void frantionProsess(int selection, int num1, int num2, int denom1, int denom2) {
			
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
