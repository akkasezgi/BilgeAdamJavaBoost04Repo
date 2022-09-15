package com.bilgeadam.boost.week04.lesson001;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ahmet", "Aslan", "erkek", 34);
		Person p2 = new Person("Ayse", "Celik", "kadin", 29);
		Person p3 = new Person("Selen", "Yilmaz",21);
		
		
		p1.getAge();
		System.out.println(p1.getAge());
		System.out.println(p2);
		
		
	

	}

}
