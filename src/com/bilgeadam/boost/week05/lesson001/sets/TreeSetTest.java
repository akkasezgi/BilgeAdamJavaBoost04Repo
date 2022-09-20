package com.bilgeadam.boost.week05.lesson001.sets;

import java.util.TreeSet;

public class TreeSetTest {



	public static void main(String[] args) {
	
		TreeSet<Student> students = new TreeSet<>();
	
		Student st = new Student();
		

		students.add(st);
		students.add(new Student(102,"Cagri",30));
		students.add(new Student(102,"Burcu",30));
		students.add(new Student(102,"Babur",30));
		

	}

	

}
