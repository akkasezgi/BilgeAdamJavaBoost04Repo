package com.bilgeadam.boost.week04.lesson001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eratosthenes {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number :  ");
		int n = input.nextInt();
		int [] arrays = new int [n];
		n = arrays.length;
		input.close();
	   
		List<Integer> arraylist = new ArrayList<>();
		       
		
		          
		     for (int i=1; i<=n; i++) {
		    	 arraylist.add(i);
		    	 System.out.println(arraylist);
		    	
			 }
		     
	             
		
			
		
	}
	  
	}
	

		
		
		
		

	


