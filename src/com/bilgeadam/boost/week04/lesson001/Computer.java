package com.bilgeadam.boost.week04.lesson001;

public class Computer {

	private String brand;
	private int ramSize;
	private int ssdCapacity;
	private double screenSize;
	private String operatingSystem;
	
	
	
	
	public Computer() {
		super();
	}

	public Computer(String brand, int ramSize, int ssdCapacity, double screenSize, String operatingSystem) {
		super();
		this.brand = brand;
		this.ramSize = ramSize;
		this.ssdCapacity = ssdCapacity;
		this.screenSize = screenSize;
		this.operatingSystem = operatingSystem;
	}

	void connectWeb() { 
		System.out.println(brand + " connect to Web.");
	}

	void showFeatures() {
		System.out.println("Computer [brand=" + brand + ", ramSize=" + ramSize + ", ssdCapacity=" + ssdCapacity + ", screenSize="
				+ screenSize + ", operatingSystem=" + operatingSystem + "]");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getSsdCapacity() {
		return ssdCapacity;
	}

	public void setSsdCapacity(int ssdCapacity) {
		this.ssdCapacity = ssdCapacity;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	

	
	}
	

