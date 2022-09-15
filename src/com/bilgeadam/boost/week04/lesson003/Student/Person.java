package com.bilgeadam.boost.week04.lesson003.Student;

public class Person {
	

	private String name;
	private int ıd;
	private Address address;
	
	
	
	
	public Person() {
		super();
	}
	
	public Person(String name, int id, Address address) {
		super();
		this.name = name;
		ıd = id;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return ıd;
	}
	public void setId(int id) {
		ıd = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", ıd=" + ıd + ", address=" + address + "]";
	}
	
	
	
	
}
