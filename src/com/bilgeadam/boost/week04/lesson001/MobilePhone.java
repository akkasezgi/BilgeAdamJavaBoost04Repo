package com.bilgeadam.boost.week04.lesson001;

import java.util.Random;

public class MobilePhone {
	private String brand;
	private double cameraMP;
	private int batteryCapacity;
	private double screenSize;
	
	
			
	
	public MobilePhone() {
		super();
	}

	public MobilePhone(String brand, double cameraMP, int batteryCapacity, double screenSize) {
		super();
		this.brand = brand;
		this.cameraMP = cameraMP;
		this.batteryCapacity = batteryCapacity;
		this.screenSize = screenSize;
	}

	void connectWeb() {
		
		System.out.println(brand + " connect to Web.");
		
	}
	
	void showFeatures() {
		
		System.out.println( "MobilePhone [brand=" + brand + ", cameraMP=" + cameraMP + ", batteryCapacity=" + batteryCapacity
				+ ", screenSize=" + screenSize + "]");
	}
 


	void remainingBattery() {
	
		Random random = new Random();
		int number = random.nextInt(10);
		
		System.out.println("remaining charge percentage: "  + (batteryCapacity - number) );
		
	}
	
	void takePhoto() {
		
		System.out.println(brand + " took a photo!");
	}

	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCameraMP() {
		return cameraMP;
	}
	public void setCameraMP(double cameraMP) {
		this.cameraMP = cameraMP;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	
	

}
