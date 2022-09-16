package com.bilgeadam.boost.week04.lesson005.arraypractise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListSomeOtherMethods {

	public static void main(String[] args) {
	
		
		List <String> list = new ArrayList<>();
		
		list.add("Ezgi");
		list.add("Cagan");
		list.add("Ugur");
		
		
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
