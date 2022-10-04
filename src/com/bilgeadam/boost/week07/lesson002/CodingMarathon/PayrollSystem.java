package com.bilgeadam.boost.week07.lesson002.CodingMarathon;

import java.util.Scanner;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class PayrollSystem {

	static List<Employee> employeeList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("=========================");
		System.out.println("=====PAYROLL SYSTEM======");
		System.out.println("=========================");
		System.out.println("1.Personel Listesi Olustur");
		System.out.println("2.Personel Listesi Goster");
		System.out.println("3.Maas Sistemi");
		System.out.println("\n" + "\n" + "Lutfen seciminizi yapiniz");
		int select = sc.nextInt();

		if (select == 1) {
			System.out.println("Personel kimlik no giriniz: ");
			long citizenId1 = sc.nextLong();
			sc.nextLine();
			System.out.println("Personel adi giriniz: ");
			String name1 = sc.nextLine();
			System.out.println("Personel soyadi giriniz: ");
			String lastName1 = sc.nextLine();
			System.out.println("Lutfen ise baslangic tarihini gun olarak giriniz");
			int startDateOfDay1 = sc.nextInt();
			System.out.println("Lutfen ise baslangic tarihini ay olarak giriniz");
			int startDateOfMonth1 = sc.nextInt();
			System.out.println("Lutfen ise baslangic tarihini yil olarak giriniz");
			int startDateOfYear1 = sc.nextInt();
			System.out.println("Lutfen personel maas bilgisi giriniz");
			double salary1 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Lutfen calisma turu (1.Full/2.Part) giriniz");
			int workType = sc.nextInt();
			
			if (workType==1) {
				employeeList.add(new Employee(new Person(citizenId1, name1, lastName1),
						LocalDate.of(startDateOfYear1, startDateOfMonth1, startDateOfDay1), null,
						new Salary(salary1, WorkingType.FULL_TIME)));
			} else if (workType==2) {
				employeeList.add(new Employee(new Person(citizenId1, name1, lastName1),
						LocalDate.of(startDateOfYear1, startDateOfMonth1, startDateOfDay1), null,
						new Salary(salary1, WorkingType.PART_TIME)));
			}else {
				System.err.println("Hatali secim yaptiniz!!");
			}
			

	} else if (select == 2) {

			for (Employee employees : employeeList) {
				System.out.println(employees.toString());

			}

	} else if (select == 3) {

			for (Employee employee : employeeList) {
				employee.getSalary();
			}

		}
		sc.close();
	}

	static void addList() {
		employeeList.add(new Employee(new Person(12312312311L, "Ezgi", "Akkas"), LocalDate.of(2020, 5, 6),
				LocalDate.of(2022, 8, 22), new Salary(20000, WorkingType.FULL_TIME)));
		employeeList.add(new Employee(new Person(12312312312L, "Ugur", "Akkas"), LocalDate.of(2020, 5, 6), null,
				new Salary(22000, WorkingType.FULL_TIME)));
		employeeList.add(new Employee(new Person(12312312313L, "Cagan", "Akkas"), LocalDate.of(2020, 5, 6),
				LocalDate.of(2022, 8, 22), new Salary(18000, WorkingType.FULL_TIME)));
		employeeList.add(new Employee(new Person(12312312314L, "Erdi", "Tuncalp"), LocalDate.of(2020, 5, 6), null,
				new Salary(28000, WorkingType.FULL_TIME)));
		employeeList.add(new Employee(new Person(12312312315L, "Sibel", "Tuncalp"), LocalDate.of(2020, 5, 6),
				LocalDate.of(2022, 8, 22), new Salary(6500, WorkingType.PART_TIME)));
		employeeList.add(new Employee(new Person(12312312316L, "Eda", "Arit"), LocalDate.of(2020, 5, 6), null,
				new Salary(7500, WorkingType.PART_TIME)));
		employeeList.add(new Employee(new Person(12312312317L, "Cansu", "Koc"), LocalDate.of(2020, 5, 6), null,
				new Salary(9000, WorkingType.PART_TIME)));
	}

}
