package com.bilgeadam.boost.week05.lesson001.lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class ConvertArrayListToAnArrayandVisaVersa {

	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Phyton");
		languages.add("C++");
		
		System.out.println(languages);
		
		String [] arr = new String[languages.size()];
		
		languages.toArray(arr);
		for (String string : arr) {
			System.out.println(string + " ");
			
		}
		
		ArrayList<String> languages2 = new ArrayList<>(Arrays.asList(arr));

	}

}
