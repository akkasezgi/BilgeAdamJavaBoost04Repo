package com.bilgeadam.boost.week04.lesson001.BreakHomework;

import java.util.Scanner;

public class Eratosthenes {
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     System.out.println("Enter n: ");
	     if (!scan.hasNextInt()) {
	        System.err.println("Please enter a number!");
	        scan.close();
	        return;
	     }
	    
         sieveOfEratosthenes(scan.nextInt());
         scan.close();
	}

    private static void sieveOfEratosthenes(int n) {
        boolean primes[] = new boolean[n+1];
        for(int i=0; i<=n; i++) {
            primes[i] = (i > 1);
        }

	    for (int i = 2; i < primes.length; i++) {
	        if (primes[i] == true) {
	            for (int j = 2; i * j < primes.length; j++) {
	                primes[i*j] = false;
	            }
	        }
	    }
	
	    for(int i = 1; i <= n; i++) {
	        if(primes[i] == true) {
	            System.out.print(i + " ");
	        } else {
	            System.out.print(i + "x ");
	        }
	    }
	   
    }
    
}