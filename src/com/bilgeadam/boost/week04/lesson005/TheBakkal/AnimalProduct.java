package com.bilgeadam.boost.week04.lesson005.TheBakkal;

import java.time.LocalDate;

public abstract class AnimalProduct extends Product {
	private AnimalProductType type;

	public AnimalProduct(String name, UnitType unit, double unitPrice, int quantity, LocalDate productionDate,
			AnimalProductType type) {
		super(name, unit, unitPrice, quantity, productionDate);
		this.type = type;
	}

	public AnimalProductType getType() {
		return type;
	}

	public void setType(AnimalProductType type) {
		this.type = type;
	}
}