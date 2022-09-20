package com.bilgeadam.boost.week05.lesson002.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SomeOtherStreamFeatures {

	public static void main(String[] args) {
	
		
		List <Integer> list = new ArrayList<>();
		
		list.add(25);
		list.add(12);
	    list.add(3);
	    list.add(89);
	    list.add(25);
	    list.add(44);
	    list.add(100);
	    list.add(7);
	    list.add(63);

	    list.stream().forEach(number -> System.out.println(number));
	    System.out.println();
	    list.stream().filter(num -> num>60).forEach(num -> System.out.println(num));
	    System.out.println();
	    //distinct(tekrarlı veri elemesi)
	    
	    list.stream()
	    .distinct()
	    .forEach(number -> System.out.println(number));
	    System.out.println();
	    // sorted
	    list.stream()
	    .sorted()
	    .forEach(number -> System.out.println(number));
	    System.out.println();
	    // reverse sorted
	    list.stream()
	    .sorted(Comparator.reverseOrder())
	    .forEach(number -> System.out.println(number));
	    System.out.println();
	    //limit
	    list.stream()
	    .limit(5)
	    .forEach(number -> System.out.println(number));
	    System.out.println();
	    //skip
	    list.stream()
	    .skip(5)
	    .limit(2)
	    .forEach(number -> System.out.println(number));
	    System.out.println();
	    //count( en son yazılır yoksa izin vermez.)
	    long count = list.stream()
	    .filter(number -> number<40)
	    .distinct()
	    .count();
	    System.out.println(count);
	    System.out.println();
	    // anyMatch (koşuldaki var mı boolean olmalı!)
	    boolean match = list
	    .stream()
	    .anyMatch(number -> number==3);
	    System.out.println(match);
	    System.out.println();
	    // allMatch
	    boolean match2 = list.stream()
	    .allMatch(number -> number <0 && number <105);
	    System.out.println(match2);
	    System.out.println();
	    //noneMatch
	    boolean match3 = list.stream().noneMatch(number -> number > 2);
	    System.out.println(match3);
	    
	}

}
