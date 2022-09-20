package com.bilgeadam.boost.week05.lesson001.lists;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		
		Queue<String> languages = new LinkedList<>();
		
		languages.add("Java");
		languages.add("Phyton");
		languages.add("C++");
		System.out.println(languages);
		
		String str = languages.peek();
		System.out.println("Accessed element: "+str);
		
		String str2 = languages.poll();
		System.out.println("Removed element: " + str2);
		System.out.println("LinkedList after pool() : " + languages);

		boolean isSuccessfull = languages.offer("Swift");
		System.out.println(isSuccessfull);
		System.out.println("LinkedList after offer(): " + languages);
	}

}
