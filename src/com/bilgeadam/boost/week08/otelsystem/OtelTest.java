package com.bilgeadam.boost.week08.otelsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtelTest {
	public static List<Otel> otelList = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		Otel otel1 = new Otel("Dedeman", "Antalya",OtelType.ALL_INCLUSIVE, 15, 4, 4211212, true, false, true, true, true, false);
		otelList.add(otel1);
		Otel otel2 = new Otel("Elexus","Bodrum", OtelType.ULTRA_ALL_INCLUSIVE, 17, 5, 1231231, false, true, true, false, false, true);
		otelList.add(otel2);
		Otel otel3 = new Otel("Limak", "Aydin", OtelType.FULL_PENSION, 18, 3, 1231232, false, false, true, true, true, true);
		otelList.add(otel3);
		Otel otel4 = new Otel("Dedeman", "izmir", OtelType.ROOM_BREAKFAST, 12, 5, 1231233, true, true, true, false, false, false);
		otelList.add(otel4);
		Otel otel5 = new Otel ("Ramada", "Antalya", OtelType.HALF_PENSION, 10, 4, 1231234, false, false, true, false, true, true);
		otelList.add(otel5);
		
		System.out.println("================================");
		System.out.println("=====Turizm Acente Sistemi======");
		System.out.println("===========HOSGELDINIZ==========");
		System.out.println("Lutfen yapmak istediginiz islemi seciniz.");
		System.out.println("1.Otel Arama");
		System.out.println("2.Rezervasyon");
		System.out.println("3.Odeme Sistemi");
		System.out.println("4.Iptal-Iade Islemleri");
		System.out.println("5.Cikis");
		int selected = scan.nextInt();
		
		if (selected == 5) {
			System.out.println("Cikis yaptiniz. Gorusmek uzere...");
		}else if(selected == 1) {
			searchHotel();
		}else if (selected == 2) {
			setReservation();
		}else if(selected == 3) {
			payrollSystem();
		}else if(selected == 4) {
			cancelReturnProsess();
		}else {
			System.err.println("Hatali giris yaptiniz. Lutfen seciminizi yapiniz.");
		}
		
		

		scan.close();
	}

	private static void cancelReturnProsess() {
		
		
	}

	private static void payrollSystem() {
	
		
	}

	private static void setReservation() {
		
		
	}

	private static void searchHotel() {
		for (Otel otels : otelList) {
			System.out.println(otels);
		}
	
	}
}
