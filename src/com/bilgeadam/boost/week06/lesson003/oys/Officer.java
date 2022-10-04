package com.bilgeadam.boost.week06.lesson003.oys;

import java.util.Locale;

public class Officer extends Employee {

	public Officer(Name name, Gender gender, boolean isMarried, double firstSalary, PhoneNumber mobilePhoneNumber,
			Locale firstDate, Locale finalDate, Locale birthDate, double startingSalary, double salary) {
		super(name, gender, isMarried, firstSalary, mobilePhoneNumber, firstDate, finalDate, birthDate, startingSalary, salary);
	
	}

	@Override
	public String generateId() {
		int numOfOfficer = 0;
		String custId = "O";
		custId = String.format("%s%03d", custId, ++numOfOfficer);
		return custId;
	}

}
