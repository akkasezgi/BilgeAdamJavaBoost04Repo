package com.bilgeadam.boost.week04.lesson005.TheBakkal;

import java.time.LocalDate;

public class FruitAndVegetable extends Product implements Perishable {

	public FruitAndVegetable(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate) {
		super(name, unit, unitPrice, quantity, productionDate);
	}

	@Override
	public int getDaysToPerish() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean expired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getShelfLifeInDays() {
		return 8;
	

}
}
