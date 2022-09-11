package com.bilgeadam.boost.week04.lesson001;

import java.util.Scanner;



class Etiopias {
	
	int total = 0;
	
	public static void main(String[] args) {
		new Etiopias().etiophiasmultiply();
		
	}
	
	public void etiophiasmultiply() {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a first number: ");
	    if (!scan.hasNextInt()) {
	        System.err.println("Please enter a number!");
	        scan.close();
	        return;
	    }
	    int a = scan.nextInt();
	    System.out.println("Enter a second number: ");
	    if (!scan.hasNextInt()) {
	        System.err.println("Please enter a number!");
	        scan.close();
	        return;
	    }
	    int b = scan.nextInt();
	    System.out.println("Result: " + multiply(a, b));
	    scan.close();
	   
	}

	private int multiply(int a1, int a2) {
	    if (a1 >= 1) {
	        if (a1 % 2 != 0) {
	            System.out.println(a1 + "*" + a2);
	            total += a2;
	        } else {
	            System.out.println(a1 + "*" + a2 + " ---");
	        }
	        return multiply(a1 / 2, a2 * 2);
	    } else {
	        return total;
	    }
	}
	
}