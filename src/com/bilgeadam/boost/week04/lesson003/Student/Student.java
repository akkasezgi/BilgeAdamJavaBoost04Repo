package com.bilgeadam.boost.week04.lesson003.Student;

public class Student extends Person {
	
	Course course;

	
	
	
	public Student() {
		super();
	}


	public Student(Course course) {
		super();
		this.course = course;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	

	
}
