package com.bilgeadam.boost.week04.lesson001;

public class MobilPhoneTest {

	public static void main(String[] args) {
	
		MobilePhone mobilPhone = new MobilePhone ();
		mobilPhone.setBrand("Apple");
		mobilPhone.setCameraMP(19.5);
		mobilPhone.setBatteryCapacity(100);
		mobilPhone.setScreenSize(11.2);

		mobilPhone.connectWeb();
		mobilPhone.showFeatures();
		mobilPhone.remainingBattery();
		mobilPhone.takePhoto();
		
	}

}
