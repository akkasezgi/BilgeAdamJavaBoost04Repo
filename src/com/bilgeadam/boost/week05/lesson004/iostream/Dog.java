package com.bilgeadam.boost.week05.lesson004.iostream;

import java.io.Serializable;

public class Dog implements Serializable {
	
	public static final long serialVersionUID = 2513483318130704735L;
	
	String name;
	String breed;
	
	
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	
	

}
