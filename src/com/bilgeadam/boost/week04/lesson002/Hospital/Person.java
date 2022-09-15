package com.bilgeadam.boost.week04.lesson002.Hospital;

public abstract class Person  {

	private String name;
	private boolean isHealty;
	private int age; 
	
	
	
	void healty() {
		boolean isHealty = true;
	
		if (isHealty=true) {
			System.out.println("please go to check-up section!!");
		}else {
			System.out.println("please go to the doctor visit and to use medicine");
		}
		
		
	}
	
	abstract void vaccine() ;

	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", isHealty=" + isHealty + ", age=" + age + "]";
	}

	public Person() {
		super();
	}
	
	public Person(String name, boolean isHealty, int age) {
		super();
		this.name = name;
		this.isHealty = isHealty;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHealty() {
		return isHealty;
	}

	public void setHealty(boolean isHealty) {
		this.isHealty = isHealty;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}


