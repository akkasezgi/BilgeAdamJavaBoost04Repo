package com.bilgeadam.boost.week04.lesson003.Student;

public class PersonTest {

	public static void main(String[] args) {
		
		Address address = new Address("Kartal", "Istanbul", "Turkiye", 34000);
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		student.setAddress(address);
		student.setName("Ezgi");
		student.setId(1234);
		
		System.out.println(student);

	}

}
