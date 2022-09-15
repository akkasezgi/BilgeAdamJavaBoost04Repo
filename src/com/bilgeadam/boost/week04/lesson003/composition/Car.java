package com.bilgeadam.boost.week04.lesson003.composition;

public class Car {

	private String brand;
	private final Engine engine;
	
	
	
	public Car(String brand, Engine engine) {
		super();
		this.brand = brand;
		this.engine = engine;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Engine getEngine() {
		return engine;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + "]";
	}
	
	
}
