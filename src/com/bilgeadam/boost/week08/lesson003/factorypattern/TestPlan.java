package com.bilgeadam.boost.week08.lesson003.factorypattern;

import java.util.Scanner;

public class TestPlan {

	public static void main(String[] args) {
		
		PlanFactory planFactory = new PlanFactory();
		System.out.println("Enter the name of plan you want to generate: ");
		Scanner scan = new Scanner(System.in);
		String planName = scan.nextLine();
		scan.nextLine();
		
		System.out.println("Enter number of units you want to calculate for " + planName + " : ");
		int units = scan.nextInt();
		Plan p = planFactory.getPlan(planName);
		
		System.out.println("");
		p.getRate();
		p.calculateBill(units);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
