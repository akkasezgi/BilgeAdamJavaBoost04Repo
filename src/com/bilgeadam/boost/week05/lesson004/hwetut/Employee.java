package com.bilgeadam.boost.week05.lesson004.hwetut;

public abstract class Employee {
	
	private String name;
	private String lastName;
	private String job;
	private double salary;
	
	abstract void maasZam();
	
	
	public Employee() {
		super();
	}
	public Employee(String name, String lastName, String job, double salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.job = job;
		this.salary = salary;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
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
		return "Employee [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary
				+ ", getName()=" + getName() + ", getLastName()=" + getLastName() + ", getJob()=" + getJob()
				+ ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
