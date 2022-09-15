package com.bilgeadam.boost.week04.lesson003.aggregation;

public class StudentTest {

	public static void main(String[] args) {
	
		Address address = new Address("sisli", "istanbul", "turkiye", 34000);
		Student student = new Student ("Ezgi", 2500, address);
		

		System.out.println(student);
	}

}
