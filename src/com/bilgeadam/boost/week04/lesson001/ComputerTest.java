package com.bilgeadam.boost.week04.lesson001;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.setBrand("Monster");
		computer.setOperatingSystem("Windows");
		computer.setRamSize(32);
		computer.setScreenSize(13.2);
		computer.setSsdCapacity(512);

		
		computer.showFeatures();
		computer.connectWeb();
	}

}
