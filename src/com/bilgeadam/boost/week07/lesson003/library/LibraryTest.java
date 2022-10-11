package com.bilgeadam.boost.week07.lesson003.library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LibraryTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Person> personList = new ArrayList<>();
		List<Book> bookList = new ArrayList<>();

		Book b1 = new Book("Serenad", "Zulu Livaneli", 442748410, 12);
		Book b2 = new Book("Beyoglu Rapsodisi", "Ahmet Umit",123456789, 8);
		Book b3 = new Book("Bozkir", "Tea Obreht", 0, 5);
		Book b4 = new Book("Sabaha Karsi", "Deniz Utlu", 0, 2);
		Book b5 = new Book("Yukselis", "Stephen King", 0, 6);
		Book b6 = new Book("Karanligin Sehri", "Sule Avlamaz", 0, 1);
		Book b7 = new Book("Muzikli Beyin", "Cesar Aira", 0, 3);
		Book b8 = new Book("Sondan Basliyoruz", "Chris Whitaker", 0, 4);
		Book b9 = new Book("Her Seyi Dusunme", "Anne Bogel", 0, 9);
		Book b10 = new Book("Seninle Baslamadi", "Mark Wolynn", 0, 7);

		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		bookList.add(b6);
		bookList.add(b7);
		bookList.add(b8);
		bookList.add(b9);
		bookList.add(b10);

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		Person p6 = new Person("babursomer", "babursomer@hotmail.com", null);
		Person p7 = new Person("hilalkorkmaz", "hilalkorkmaz@hotmail.com", null);
		Person p8 = new Person("caganakkas", "caganakkas@hotmail.com", null);
		Person p9 = new Person("cagriturkmen", "cagriturkmen@hotmail.com", null);
		Person p10 = new Person("ezgiakkas", "ezgiakkas@hotmail.com", null);

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		personList.add(p6);
		personList.add(p7);
		personList.add(p8);
		personList.add(p9);
		personList.add(p10);

		System.out.println("===============================");
		System.out.println("====Kutuphaneye hosgeldiniz====");
		System.out.println("===============================");
		System.out.println("");
		System.out.println("Kutuphane sisteminde kaydiniz var mi? (E/H)");
		String select = sc.nextLine();

		if (select.equalsIgnoreCase("H")) {

			System.out.println("Uyelik sayfasina yonlendiriliyorsunuz....");
			System.out.println("Lutfen kullanici adi giriniz: ");
			p2.setMemberName(sc.nextLine());
			System.out.println("Lutfen kullanici maili giriniz: ");
			p2.setMemberLastname(sc.nextLine());
			
			

			System.out.println("Hosgeldiniz " + p2.getMemberName());
			

		} else if (select.equalsIgnoreCase("E")) {
			System.out.println("Kullanici adi: ");
			String newMemberName = sc.nextLine();
			System.out.println("Kullanici maili: ");
			String newMemberMail = sc.nextLine();
			
			if (personList.stream().filter()

//			if (personList.stream().forEach(null) && memberMail.equalsIgnoreCase(memberMail)){
//				
//			}
			
//			if (personList.contains(memberName) && personList.contains(memberMail)) {
//				System.out.println("Hosgeldiniz " + memberName);
//			} else {
//				System.err.println("Kullanici adi ve/veya mail hatali!!!");
//			}

		} else {
			System.err.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz!");
		}

		
		System.out.println("Lutfen kitap listesinden istediginiz kitap icin ISBN giriniz: ");
		
		for (Book book : bookList) {
			System.out.println(book);
			
			
		}
		sc.close();
	}


	
	

}
