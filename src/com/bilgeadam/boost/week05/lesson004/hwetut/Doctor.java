package com.bilgeadam.boost.week05.lesson004.hwetut;

public class Doctor extends Person implements Accountable {
	
	

	

	public Doctor(String name, String lastName, Occupation job, double salary) {
		super(name, lastName, job, salary);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String increaseSalary(double salary) {
		 
		salary = salary + 1.40;
		return "New salary" + salary ;
	}



	@Override
	void maasZam() {
		// TODO Auto-generated method stub
		
	}

}
