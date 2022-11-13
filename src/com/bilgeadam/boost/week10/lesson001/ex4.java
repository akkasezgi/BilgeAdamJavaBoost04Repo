package com.bilgeadam.boost.week10.lesson001;

public class ex4 {

	public static void main(String[] args) {

		System.out.println("*");	
		for (int i = 1; i <= 10; i += 2) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
