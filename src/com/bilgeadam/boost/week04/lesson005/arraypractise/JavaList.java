package com.bilgeadam.boost.week04.lesson005.arraypractise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {
		
//   search işlemleri daha hızlı 
		List<String> list1 = new ArrayList<>();
		
//		manipulasyon(ekleme-cıkarma-güncelleme daha hızlı
		List<String> list2 = new LinkedList<>();
		
		list1.add("Ezgi");
		list1.add("Cagan");
		list1.add("Ugur");
		System.out.println(list1);
		
		list2.addAll(list1);
		
		System.out.println(list2);
		
		System.out.println(list1.get(1));
		
		System.out.println(list1.size());
		
		list1.remove(0);
		
		System.out.println(list1.contains("Cagan"));
		
		
		
	}

}
