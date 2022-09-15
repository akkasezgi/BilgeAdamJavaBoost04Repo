package com.bilgeadam.boost.week04.lesson003.composition;

public class CarTest {

	public static void main(String[] args) {
	
		Engine engine = new Engine(MotorType.ELECTRIC,300 ,8);
		
		Car car = new Car ("Mustang",engine);
		
		System.out.println(car);
	}

}
