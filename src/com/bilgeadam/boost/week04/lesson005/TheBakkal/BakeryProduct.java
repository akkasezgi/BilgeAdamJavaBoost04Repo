package com.bilgeadam.boost.week04.lesson005.TheBakkal;

import java.time.LocalDate;

public class BakeryProduct extends Product {

	public BakeryProduct(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate) {
		super(name, unit, unitPrice, quantity, productionDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BakeryProduct [toString()=" + super.toString() + "]";
	}

	@Override
	public boolean expired() {
		return false;
	}
	
}