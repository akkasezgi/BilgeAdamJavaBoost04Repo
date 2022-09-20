package com.bilgeadam.boost.week05.lesson002.hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SelectedCity {

	public static void main(String[] args) {
		
		
		Map<Integer, String> cities = new HashMap<>();
		
		    cities.put(58, "Sivas");
	        cities.put(01, "Adana");
	        cities.put(33, "Mersin");
	        cities.put(38, "Kayseri");
	        cities.put(16, "Bursa");
	        cities.put(02, "Adiyaman");
	        
		
	   Map<String, String > foods = new HashMap<>();
	        foods.put("Sivas", "Sivas Koftesi");
	        foods.put("Adana", "Kebab");
	        foods.put("Mersin", "Tantuni");
	        foods.put("Kayseri", "Manti");
	        foods.put("Bursa","Iskender");
	        foods.put("Adiyaman", "CigKofte");
	        
	        
	        Scanner scan = new Scanner (System.in);
	        System.out.println("Lutfen il plaka kodu gir. ");
	        int n = scan.nextInt();
	        
	        String city = cities.get(n);
	        String food = foods.get(cities.get(n));
	        
	        System.out.println(city);
	        System.out.println(food);
		

	   
	   
	}

}
