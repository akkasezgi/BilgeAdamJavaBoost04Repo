package com.bilgeadam.boost.week07.lesson002.CodingMarathon;

public class Person {
	
	private long citizenId;
	private String name;
	private String lastName;
	
	
	
	public Person() {
		super();
	}


	public Person(long citizenId, String name, String lastName) {
		super();
		this.citizenId = citizenId;
		this.name = name;
		this.lastName = lastName;
	}


	public long getCitizenId() {
		return citizenId;
	}


	public String getName() {
		return name;
	}



	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return name + " " + lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	
	public void setCitizenId(long citizenId) {
		this.citizenId = citizenId;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person [citizenId=" + citizenId + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	

}
