package com.bilgeadam.boost.week07.lesson003.gallery;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarTest {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		carDescribing();

	}

	private static void carDescribing() {

		Car car1 = new Car(BrandType.BMW, 2016, "manuel", 23_000, GasolineType.LPG);
		Car car2 = new Car(BrandType.MERCEDES, 2020, "automatic", 7_500, GasolineType.GASOLİNE);
		Car car3 = new Car();

		car3.setBrand(BrandType.FORD);
		car3.setYear(2018);
		car3.setGear("half-automatic");
		car3.setGasolinetype(GasolineType.DİESEL);

		Map<Integer, Car> carList = new HashMap<>();
		carList.put(1012, car1);
		carList.put(1013, car2);
		carList.put(1014, car3);

		Map<Car, String> carColourList = new HashMap<>();
		carColourList.put(car1, "white");
		carColourList.put(car2, "black");
		carColourList.put(car3, "red");

		System.out.println("Arac model kodu giriniz: ");
		int select = sc.nextInt();

		System.out.println(carList.get(select));
		;
		System.out.println(carColourList.get(carList.get(select)));

		salesProsess();
	}

	private static void salesProsess() {

		System.out.println("Arac icin yapilacak islemi lutfen listeden seciniz: ");
		System.out.println("1.Arac Satisi");
		System.out.println("2.Arac Kiralama");
		System.out.println("3.Arac Servis İslemleri");
		System.out.println("4.Cikis");
		int prosessSelect = sc.nextInt();
		
		if (prosessSelect == 4) {
			System.err.println("Cikis yaptiniz.Gorusmek uzere..");
			
		}else if (prosessSelect==1) {
			
		}else if (prosessSelect==2) {
			
		}else if (prosessSelect==3) {
			
		}else {
			System.err.println("Hatali secim yaptiniz. Lutfen tekrar deneyiniz.");
		}
		

	}

}
