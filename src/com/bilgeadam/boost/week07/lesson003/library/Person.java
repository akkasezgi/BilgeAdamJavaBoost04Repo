package com.bilgeadam.boost.week07.lesson003.library;


public class Person {
	
	private String memberName;
	private String memberMail;
	private String id;
	private static int numOfPerson = 0;
	
	
	
	public Person() {
		super();
	}
	
	public Person(String memberName, String memberMail, String id) {
		super();
		this.memberName = memberName;
		this.memberMail = memberMail;
		this.id = id;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberLastname() {
		return memberMail;
	}
	public void setMemberLastname(String memberMail) {
		this.memberMail = memberMail;
	}
	public String getId() {
		this.id = String.format("%s%03d",  ++Person.numOfPerson); 
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [memberName=" + memberName + ", memberMail=" + memberMail + ", id=" + id + "]";
	}


}
