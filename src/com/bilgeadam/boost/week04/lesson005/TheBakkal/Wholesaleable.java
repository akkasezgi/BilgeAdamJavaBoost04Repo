package com.bilgeadam.boost.week04.lesson005.TheBakkal;

public interface Wholesaleable {
	
	default double getDiscountRate() {
		return 0.15;
	}
	
	int getWholeUnitAmount();
}