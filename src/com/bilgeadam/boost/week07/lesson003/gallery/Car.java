package com.bilgeadam.boost.week07.lesson003.gallery;


public class Car {
	
	private BrandType brand;
	private int year;
	private String gear;
	private int km;
	private GasolineType gasolinetype;
	
	
	
	public Car() {
		super();
	}


	public Car(BrandType brand, int year, String gear, int km, GasolineType gasolinetype) {
		super();
		this.brand = brand;
		this.year = year;
		this.gear = gear;
		this.km = km;
		this.gasolinetype = gasolinetype;
	}


	public BrandType getBrand() {
		return brand;
	}


	public void setBrand(BrandType brand) {
		this.brand = brand;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getGear() {
		return gear;
	}


	public void setGear(String gear) {
		this.gear = gear;
	}


	public int getKm() {
		return km;
	}


	public void setKm(int km) {
		this.km = km;
	}


	public GasolineType getGasolinetype() {
		return gasolinetype;
	}


	public void setGasolinetype(GasolineType gasolinetype) {
		this.gasolinetype = gasolinetype;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", year=" + year + ", gear=" + gear + ", km=" + km + ", gasolinetype="
				+ gasolinetype + "]";
	}
	

}
