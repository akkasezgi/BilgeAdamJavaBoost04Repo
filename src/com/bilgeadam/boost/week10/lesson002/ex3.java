package com.bilgeadam.boost.week10.lesson002;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int result = 0;

		System.out.print("Please enter a number ");
		int userNumber = scan.nextInt();

		for (int i = 1; i < userNumber; i++) {
			if (userNumber % i == 0) {
				result += i;
			}
		}
		if (userNumber == result) {
			System.out.println(userNumber + " is a perfect number.");
		} else {
			System.out.println(userNumber + " is not a perfect number.");
		}

	}

}
