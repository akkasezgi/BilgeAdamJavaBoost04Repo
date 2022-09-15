package com.bilgeadam.boost.week04.lesson003.aggregation;

public class Student {

	String name;
	int rollNo;
	Address address;
	
	
	
	public Student() {
		super();
	}
	
	
	public Student(String name, int rollNo, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", address=" + address + "]";
	}
	
	
	
	
}
