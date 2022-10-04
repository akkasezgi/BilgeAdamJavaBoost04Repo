package com.bilgeadam.boost.week06.lesson003.oys;

import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public class Employee extends Person{
	
	

	private double startingSalary;
	//private double salary;
	private String registerNum;
	
	

	public double salary() {
		Date firstDate = getFirstDate();
		Date secondDate = new Date();
		long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = diffInMillies / (1000 * 60 * 24 * 30);
	    int increaseNum = Integer.parseInt(diff / 6);
		return startingSalary * Math.pow(1.1, increaseNum);
		
	}
	

	

	public Employee(Name name, Gender gender, boolean isMarried, double firstSalary, PhoneNumber mobilePhoneNumber,
			Locale firstDate, Locale finalDate, Locale birthDate, double startingSalary, double salary) {
		super(name, gender, isMarried, firstSalary, mobilePhoneNumber, firstDate, finalDate, birthDate);
		this.startingSalary = startingSalary;
		
	}


	@Override
	public String toString() {
		return "Employee [startingSalary=" + startingSalary + ", registerNum()=" + registerNum
				+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", isMarried()=" + isMarried()
				+ ", getFirstSalary()=" + getFirstSalary() + ", getMobilePhoneNumber()=" + getMobilePhoneNumber()
				+ ", getFirstDate()=" + getFirstDate() + ", getFinalDate()=" + getFinalDate() + ", getBirthDate()="
				+ getBirthDate() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	

	 




	
	}
