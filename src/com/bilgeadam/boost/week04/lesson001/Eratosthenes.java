package com.bilgeadam.boost.week04.lesson001;

import java.util.Scanner;

public class Eratosthenes {
	
	public static void main(String[] args) {
//	
//		Scanner input = new Scanner(System.in);
//		System.out.println("enter a number :  ");
//		int n = input.nextInt();
//		
//		int [] arrays = new int [n];
//		
//		arrays[0] = 1;
//		arrays[1] = 2;
//		
//			
//		
	}
	
	
	
		
	  static int[] Primes = new int[500001];
	 
	  static void SieveOfEratosthenes(int n)  {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("enter a number: ");
		  int z = scan.nextInt();
		  
	    Primes[0] = 1;
	    for (int i = 3; i * i <= z; i += 2) {
	      if (Primes[i / 2] == 0) {
	    	  System.out.println(i);
	        for (int j = 3 * i; j <= n; j += 2 * i)
	          Primes[j / 2] = 1;
	        System.out.println();
	      }
	    }
	  
	  
	}
 
	
	}
		

		
		
		
		

	


