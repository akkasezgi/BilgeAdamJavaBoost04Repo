package com.bilgeadam.boost.week06.lesson003.oys;


import java.util.Date;


public abstract class Person {
		
	
	private Name name;
	private Gender gender;
	private boolean isMarried;
	private double firstSalary;
	private PhoneNumber mobilePhoneNumber;
	private Date firstDate;
	private Date finalDate;
	private Date birthDate;
	
	
	
	public Person() {
		super();
	}


	public Person(Name name, Gender gender, boolean isMarried, double firstSalary, PhoneNumber mobilePhoneNumber,
			Date firstDate, Date finalDate, Date birthDate) {
		super();
		this.name = name;
		this.gender = gender;
		this.isMarried = isMarried;
		this.firstSalary = firstSalary;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.firstDate = firstDate;
		this.finalDate = finalDate;
		this.birthDate = birthDate;
	}

	
	

	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public boolean isMarried() {
		return isMarried;
	}


	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}


	public double getFirstSalary() {
		return firstSalary;
	}


	public void setFirstSalary(double firstSalary) {
		this.firstSalary = firstSalary;
	}


	public PhoneNumber getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}


	public void setMobilePhoneNumber(PhoneNumber mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}


	public Date getFirstDate() {
		return firstDate;
	}


	public void setFirstDate(Date firstDate) {
		this.firstDate = firstDate;
	}


	public Date getFinalDate() {
		return finalDate;
	}


	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", isMarried=" + isMarried + ", firstSalary="
				+ firstSalary + ", mobilePhoneNumber=" + mobilePhoneNumber + ", firstDate=" + firstDate + ", finalDate="
				+ finalDate + ", birthDate=" + birthDate  + "]";
	}
	
	

}
