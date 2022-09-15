package com.bilgeadam.boost.week04.lesson001.BreakHomework;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a word: ");
		String word = sc.next();
		String wordOpposite = "";
		sc.close();
		
		int n = word.length();
		
		     for (int i=0; i<=n-1; i++) {
		    	 wordOpposite += word.charAt(word.length()-1-i);
		     }
             if (word.equals(wordOpposite)) {
            	 System.out.println("The word is palindrome!");
            	 
             }else {
            	 System.out.println("The word is not palindrome!");
             }
	}

}
