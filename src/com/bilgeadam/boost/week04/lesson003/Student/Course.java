package com.bilgeadam.boost.week04.lesson003.Student;

public class Course {

	
	int lessonCode;
	String description;
	
	
	
	
	public Course() {
		super();
	}




	public Course(int lessonCode, String description) {
		super();
		this.lessonCode = lessonCode;
		this.description = description;
	}




	public int getLessonCode() {
		return lessonCode;
	}




	public void setLessonCode(int lessonCode) {
		this.lessonCode = lessonCode;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	@Override
	public String toString() {
		return "Course [lessonCode=" + lessonCode + ", description=" + description + "]";
	}
	
	
	
}
