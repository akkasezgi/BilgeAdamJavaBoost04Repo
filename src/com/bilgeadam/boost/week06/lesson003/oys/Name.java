package com.bilgeadam.boost.week06.lesson003.oys;

public class Name {
	
	private String firstName;
	private String middleName;
	private String surName;
	
	
	public Name() {
		super();
	}


	public Name(String fullName) {
		super();
		String[] names = fullName.split(" ");
		if (names.length == 2) {
			this.firstName = names[0];
			this.surName = names[1];
		} else {
			this.firstName = names[0];
			this.middleName = names[1];
			this.surName = names[2];
		}
	}


	public Name(String firstName, String middleName, String surName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", surName=" + surName + "]";
	}


	
}
