package com.bilgeadam.boost.week06.lesson003.oys;

import java.util.Date;
import java.util.Locale;

public class Teacher extends Employee implements Attainable {

	
public Teacher(Name name, Gender gender, boolean isMarried, double firstSalary, PhoneNumber mobilePhoneNumber,
			Locale firstDate, Locale finalDate, Locale birthDate, double startingSalary, double salary) {
		super(name, gender, isMarried, firstSalary, mobilePhoneNumber, firstDate, finalDate, birthDate, startingSalary, salary);
	
	}



private ClassName className;
	
	public static boolean isAttendTheClass;
	
	Course course;
	
	
	public double salary() {
		Date firstDate = getFirstDate();
		Date secondDate = new Date();
		long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = diffInMillies / (1000 * 60 * 24 * 30);
	    int increaseNum = Integer.parseInt(diff / 6);
		return startingSalary * Math.pow(1.1, increaseNum);
		
	}
	
//	@Override
//	public String registerNum {
//		int numOfTeacher = 0;
//		String custId = "T";
//		custId = String.format("%s%03d", custId, ++numOfTeacher);
//		return custId;
//	}
	
	
	@Override
	public boolean isAttendTheClass() {
		
		return isAttendTheClass;
	}

	
	
	@Override
	public String toString() {
		return "Teacher [className=" + className + ", generateId()=" + generateId() + ", isAttendTheClass()="
				+ isAttendTheClass() + ", getName()=" + getName() + ", getGender()=" + getGender() + ", isMarried()="
				+ isMarried() + ", getFirstSalary()=" + getFirstSalary() + ", getMobilePhoneNumber()="
				+ getMobilePhoneNumber() + ", getFirstDate()=" + getFirstDate() + ", getFinalDate()=" + getFinalDate()
				+ ", getBirthDate()=" + getBirthDate() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	
	
}
