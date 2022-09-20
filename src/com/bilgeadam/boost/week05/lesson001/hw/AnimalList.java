package com.bilgeadam.boost.week05.lesson001.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalList {

	public static void main(String[] args) {
		
		List <String> animals = new ArrayList<>();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Pig");
		animals.add("Giraffe");
		animals.add("Elephant");
		animals.add("Penguin");
		animals.add("Monkey");
		animals.add("Orca");
		animals.add("Whale");
		animals.add("Bear");

		System.out.println(animals);
		String animal = animals.get(2);
		System.out.println(animal);
		
		String animal1 = animals.remove(4);
		
		animals.set(5, "Platypus");
		System.out.println(animals);
		
		for (String animal3 : animals) {
			System.out.println(animal3);
			
			System.out.println(animals.size());
			
			System.out.println(animals.isEmpty());
			
			System.out.println(animals.contains("Dog"));
			
			System.out.println(animals.indexOf("Orca"));
			
		    System.out.println(animals.set(1, "Giraffe"));
		    
		    System.out.println(animals.remove("Dog"));
		    
// sublist ilk indexi dahil ederken son indexe kadar alıyor. son indexi almıyor.
		    List<String> newList = animals.subList(2, 6);
		    System.out.println(newList);
		    
		    Collections.reverse(animals);
		    System.out.println(animals);
		    
		    Collections.sort(animals);
		    System.out.println(animals);
		    

		    Collections.sort(animals,Collections.reverseOrder());
		    System.out.println(animals);
		    

		    animals.removeAll(animals);
		    System.out.println(animals);
		    
		}
		
		
	}

}
