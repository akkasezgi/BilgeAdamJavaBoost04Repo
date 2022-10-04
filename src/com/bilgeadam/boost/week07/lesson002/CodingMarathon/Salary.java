package com.bilgeadam.boost.week07.lesson002.CodingMarathon;


import java.util.HashMap;
import java.util.Map;

public class Salary {
	


	private double salary;
	private WorkingType workingType;
	private Map<String, Double> workTime = new HashMap<>();

	public Salary(double salary, WorkingType workingType) {
		super();

		this.salary = salary;
		this.workingType = workingType;
		
	}

	public double getSalary() {
		
		if (workingType == WorkingType.FULL_TIME) {
			return salary * 1.25; 
		} else {
			double hourly = salary / 180;
			double workTime = this.workTime.get("2022-09");
			return hourly * workTime * 1.08; 
		}
	}

	
	
	
	public void addWorkTime(String date, double time) {
		this.workTime.put(date, time);
	}



	@Override
	public String toString() {
		return "Salary [salary=" + salary + "]";
	}

}
