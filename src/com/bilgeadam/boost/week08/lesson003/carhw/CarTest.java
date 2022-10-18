package com.bilgeadam.boost.week08.lesson003.carhw;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
	
		CarFactory carFactory = new CarFactory();
		System.out.println("Enter the type of car you want to ride: ");
		Scanner scan = new Scanner(System.in);
		String carName = scan.nextLine();
		scan.nextLine();
		System.out.println("Enter your car of gas tank size " + carName + " : ");
		int gasTank = scan.nextInt();
		System.out.println();
		int tyresSize= scan.nextInt();
		Car c1 = carFactory.getCar(carName);
		
		
		System.out.println("");
		c1.placeGasTank(gasTank);
		c1.insertTyres(tyresSize);


	}

}
