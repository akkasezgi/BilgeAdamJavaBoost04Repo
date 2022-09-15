package com.bilgeadam.boost.week04.lesson002.abstraction;

public class BikeTest {

	public static void main(String[] args) {
		
		SportsBike sports = new SportsBike();
		MountainBike mountain = new MountainBike();
		
		sports.brake();
		mountain.brake();

	}

}
