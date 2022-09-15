package com.bilgeadam.boost.week04.lesson003.Student;

public class Teacher extends Person {
	
	String branch;
	
	

	public Teacher() {
		super();
	}



	public Teacher(String branch) {
		super();
		this.branch = branch;
	}



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}



	@Override
	public String toString() {
		return "Teacher [branch=" + branch + "]";
	}
	
	
	

}
