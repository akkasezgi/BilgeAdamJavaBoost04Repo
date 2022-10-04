package com.bilgeadam.boost.week06.lesson003.oys;

import java.util.Scanner;

public class SchoolManagementTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("***School Management System ***");
		System.out.println("***        Main Menu        ***");
		System.out.println("===============================");
		System.out.println("===============================");
		System.out.println("1. Yeni Personel Girisi");
		System.out.println("2. Personel Listesi");
		System.out.println("3. Eski Personel Listesi");
		System.out.println("4. Yeni Sinif Girisi");
		System.out.println("5. Ogrenci Atama");
		System.out.println("6. Sinif Listesi");
		System.out.println("7. Ogrencinin Katildigi Siniflar");
		System.out.println("8. Hediye Listesi");
		System.out.println("9. Maas Listesi");
		System.out.println("10.Cikis");

		System.out.println("\n" + "\n" + "Lutfen seciminizi yapiniz.");
		int select = sc.nextInt();
		
		
		
		switch (select) {
		case 1: {
			
			System.out.println("Personel ad-soyad giriniz: ");
			String name= sc.next();
			System.out.println("Lutfen cinsiyet giriniz: ");
			String gender = sc.next();
			Gender gender1;
			if (gender.equalsIgnoreCase("M")) {
				gender1 = Gender.MALE;
			} else if (gender.equalsIgnoreCase("F")) {
				gender1 = Gender.FEMALE;
			} else {
				gender1 = Gender.NO_GENDER;
			}
			System.out.println("Medeni durumunuzu giriniz (E/H)");
			boolean isMarried = sc.next().equals("E");
			
			Employee e1 = new Employee(new Name(name), gender1, isMarried, select, null, null, null, null, select, select);
			
			

			break;
		}
		case 2: {

			break;
		}
		case 3: {

			break;
		}
		case 4: {

			break;
		}
		case 5: {

			break;
		}
		case 6: {

			break;
		}
		case 7: {

			break;
		}
		case 8: {

			break;
		}
		case 9: {

			break;
		}
		case 10: {
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + select);
		}

	}

}
