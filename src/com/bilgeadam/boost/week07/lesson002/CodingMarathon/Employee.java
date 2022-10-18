package com.bilgeadam.boost.week07.lesson002.CodingMarathon;


import java.time.LocalDate;



public class Employee extends Person {

	//private Person person;
	private LocalDate startDate;
	private LocalDate finishDate;
	private String regNumber;
	private Salary salary;
	private static int numOfEmployees = 0;
	
	
	public Employee() {
		super();
	}

	

	
	public Employee(Person person, LocalDate startDate, LocalDate finishDate, Salary salary) {
		super();
		//this.person = person;
		this.setName(person.getName());
		this.setLastName(person.getLastName());
		this.setCitizenId(person.getCitizenId());
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.salary = salary;
	}


	
	public Employee(long citizenId, String name, String lastName) {
		super(citizenId, name, lastName);
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getFinishDate() {
		return finishDate;
	}


	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}


	public String getRegNumber() {
	
		return regNumber;
		
	}


	public void setRegNumber(String regNumber) {
		this.regNumber = String.format("%s%04d", startDate.getYear(),  ++Employee.numOfEmployees); 
		this.regNumber = regNumber;
	}


	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public static int getNumOfEmployees() {
		return numOfEmployees;
	}


	public static void setNumOfEmployees(int numOfEmployees) {
		Employee.numOfEmployees = numOfEmployees;
	}

	@Override
	public String toString() {
		return "Employee [Name  + " + getFullName() + "startDate=" + startDate + ", finishDate=" + finishDate + ", regNumber="
				+ regNumber + ", salary=" + salary.toString() + "]";
	}


	
	
	
	
}