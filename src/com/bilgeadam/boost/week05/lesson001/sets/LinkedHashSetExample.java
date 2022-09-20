package com.bilgeadam.boost.week05.lesson001.sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {


		LinkedHashSet<String> days = new LinkedHashSet<>();
		
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		
		for (String day : days) {
			System.out.println(days);
			
		}
		
	}

}
