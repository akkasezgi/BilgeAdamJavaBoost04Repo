package com.bilgeadam.boost.week06.lesson003.oys;

import java.util.Locale;

public class Janitor extends Employee {

	public Janitor(Name name, Gender gender, boolean isMarried, double firstSalary, PhoneNumber mobilePhoneNumber,
			Locale firstDate, Locale finalDate, Locale birthDate, double startingSalary, double salary) {
		super(name, gender, isMarried, firstSalary, mobilePhoneNumber, firstDate, finalDate, birthDate, startingSalary, salary);
		
	}

	@Override
	public String generateId() {
		int numOfJanitor = 0;
		String custId = "J";
		custId = String.format("%s%03d", custId, ++numOfJanitor);
		return custId;
	}

}
