package com.bilgeadam.boost.week04.lesson005.TheBakkal;

import java.time.LocalDate;

public class Cereals extends Product implements Wholesaleable {

	public Cereals(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate) {
		super(name, unit, unitPrice, quantity, productionDate);
	}

	@Override
	public boolean expired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getWholeUnitAmount() {
		return 10;
	}

}