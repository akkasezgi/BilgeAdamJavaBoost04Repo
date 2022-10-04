package com.bilgeadam.boost.week05.lesson004.hwetut;

public abstract class Person {
	
	private String name;
	private String lastName;
	Occupation job;
	private double salary;
	
	
	
	public Person(String name, String lastName, Occupation job, double salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.job = job;
		this.salary = salary;
	}




	abstract void maasZam();
	
	
	

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

	public Occupation getJob() {
		return job;
	}

	public void setJob(Occupation job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
	}
	
	
	
}
