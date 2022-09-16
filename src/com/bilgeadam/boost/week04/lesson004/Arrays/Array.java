package com.bilgeadam.boost.week04.lesson004.Arrays;

public class Array {

	public static void main(String[] args) {
		
		double top=0;
		
		int [] size = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		
		for (int i : size) {
			top = top + i;
		}
		
		System.out.println(top);
		System.out.println(top / size.length);
	}

}
