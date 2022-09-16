package com.bilgeadam.boost.week04.lesson004.PolygonInterface;

public class Triangle implements Shape {

	
	int x;
	int y;
	
	@Override
	public double calculateArea() {
		
		return x*y;
	}
	
}
