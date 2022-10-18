package com.bilgeadam.boost.week08.otelsystem;

public class Otel {
	
	private String name;
	private String city;
	OtelType otelType;
	private int  roomArea;
	private int numOfStars;
	private long phoneNumber;
	private boolean isNearBeach;
	private boolean hasCarPark;
	private boolean hasPool;
	private boolean hasFitness;
	private boolean hasSpa;
	private boolean hasHouseKeeping;
	
	
	public Otel() {
		super();
	}


	public Otel(String name, String city, OtelType otelType, int roomArea, int numOfStars, long phoneNumber, boolean isNearBeach,
			boolean hasCarPark, boolean hasPool, boolean hasFitness, boolean hasSpa, boolean hasHouseKeeping) {
		super();
		this.name = name;
		this.city = city;
		this.otelType = otelType;
		this.roomArea = roomArea;
		this.numOfStars = numOfStars;
		this.phoneNumber = phoneNumber;
		this.isNearBeach = isNearBeach;
		this.hasCarPark = hasCarPark;
		this.hasPool = hasPool;
		this.hasFitness = hasFitness;
		this.hasSpa = hasSpa;
		this.hasHouseKeeping = hasHouseKeeping;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	
	
	public OtelType getOtelType() {
		return otelType;
	}


	public void setOtelType(OtelType otelType) {
		this.otelType = otelType;
	}


	public int getRoomArea() {
		return roomArea;
	}


	public void setRoomArea(int roomArea) {
		this.roomArea = roomArea;
	}


	public int getNumOfStars() {
		return numOfStars;
	}


	public void setNumOfStars(int numOfStars) {
		this.numOfStars = numOfStars;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public boolean isNearBeach() {
		return isNearBeach;
	}


	public void setNearBeach(boolean isNearBeach) {
		this.isNearBeach = isNearBeach;
	}


	public boolean isHasCarPark() {
		return hasCarPark;
	}


	public void setHasCarPark(boolean hasCarPark) {
		this.hasCarPark = hasCarPark;
	}


	public boolean isHasPool() {
		return hasPool;
	}


	public void setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
	}


	public boolean isHasFitness() {
		return hasFitness;
	}


	public void setHasFitness(boolean hasFitness) {
		this.hasFitness = hasFitness;
	}


	public boolean isHasSpa() {
		return hasSpa;
	}


	public void setHasSpa(boolean hasSpa) {
		this.hasSpa = hasSpa;
	}


	public boolean isHasHouseKeeping() {
		return hasHouseKeeping;
	}


	public void setHasHouseKeeping(boolean hasHouseKeeping) {
		this.hasHouseKeeping = hasHouseKeeping;
	}


	@Override
	public String toString() {
		return "Otel [name=" + name + ", city=" + city + ", otelType=" + otelType + ", roomArea=" + roomArea
				+ ", numOfStars=" + numOfStars + ", phoneNumber=" + phoneNumber + ", isNearBeach=" + isNearBeach
				+ ", hasCarPark=" + hasCarPark + ", hasPool=" + hasPool + ", hasFitness=" + hasFitness + ", hasSpa="
				+ hasSpa + ", hasHouseKeeping=" + hasHouseKeeping + "]";
	}


	
	
	
	
	
	
	
	
	
	
	

}
