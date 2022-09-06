package com.bilgeadam.boost.week04.lesson001;

import java.util.Scanner;



public class Backtracking {

	public static void main(String[] args) {
		
		backs();
	

	}

	
	
	private static void backs() {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word key: ");
		String myWord = scan.next();
		
		String array [] = new String[myWord.length()];
		char ch = myWord.charAt(0);
		 
		
         if ((ch >= 'a') && (ch <= 'z')){
		     for (int i=0; i<myWord.length(); i++) {
			    String key = myWord.substring(i,i+1);
		        array[i]=key;
		     }
		     for(int i = array.length-1; i >= 0; i--) {
			   System.out.print(array[i]);
		     }  
		     
	    }  else {
		   System.err.println("wrong entry!! please enter a word key");
	}
	
	
	
		
		


	}

	

}
