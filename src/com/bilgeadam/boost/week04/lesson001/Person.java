package com.bilgeadam.boost.week04.lesson001;

public class Person {
	private String name;
	private String lastName;
	private String gender;
	private int age;
	
		
	
	public Person() {
		super();
	}
	
	
	
	public Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}



	public Person(String name, String lastName, String gender, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + "]";
	}
	

	
}
