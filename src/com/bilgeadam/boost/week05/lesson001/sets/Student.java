package com.bilgeadam.boost.week05.lesson001.sets;

public class Student {

	private int ıd;
	private String name;
	private int grade;
	
	
	
	public Student() {
		super();
	}



	public Student(int id, String name, int grade) {
		super();
		this.ıd = id;
		this.name = name;
		this.grade = grade;
	}



	public int getId() {
		return ıd;
	}



	public void setId(int id) {
		ıd = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	@Override
	public String toString() {
		return "Student [ıd=" + ıd + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
}
