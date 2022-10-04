package com.bilgeadam.boost.week07.lesson002.CodingMarathon;

public class Salary {
	


	private double salary;
	private WorkingType workingType;

	public Salary(double salary, WorkingType workingType) {
		super();

		this.salary = salary;
		this.workingType = workingType;
	}

	public double getSalary() {
		if (workingType == WorkingType.FULL_TIME) {
			return salary + 0.25; 
		} else {
			return salary + 0.08; 
		}
	}

	@Override
	public String toString() {
		return "Salary [salary=" + salary + "]";
	}

}
