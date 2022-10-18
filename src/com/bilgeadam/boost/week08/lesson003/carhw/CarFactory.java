package com.bilgeadam.boost.week08.lesson003.carhw;

public class CarFactory {

	public Car getCar(String carType) {
		if(carType == null) {
			return null;
		}
		if (carType.equalsIgnoreCase("SEDAN")) {
			return new Sedan();
		}else if (carType.equalsIgnoreCase("HATCHBACK")) {
				return new HatchBack();
			}else if (carType.equalsIgnoreCase("JEEP")) {
				return new Jeep();
			}
			return null;
	}	

}
