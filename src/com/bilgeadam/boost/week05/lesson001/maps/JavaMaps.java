package com.bilgeadam.boost.week05.lesson001.maps;

import java.util.HashMap;
import java.util.Map;

public class JavaMaps {

	public static void main(String[] args) {


		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Nine", 9);
		
		System.out.println(numbers);
		
		System.out.println(numbers.keySet());
		
		System.out.println(numbers.values());
		
		System.out.println(numbers.entrySet());
		
		 int value = numbers.remove("Nine");
		 System.out.println(value);
				 
		 System.out.println(numbers.get("One"));
		 
		 for (Integer entry : numbers.values() ) {
			if( entry == 1) {
				numbers.values();
				
			}
		}
		
	}

}
