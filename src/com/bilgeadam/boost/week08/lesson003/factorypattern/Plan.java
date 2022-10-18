package com.bilgeadam.boost.week08.lesson003.factorypattern;

public abstract class Plan {
	
	
	protected double rate;
	abstract void getRate();
	
	
	public void calculateBill(int units) {
		System.out.println(units*rate);
	
	}

}
