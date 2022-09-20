package com.bilgeadam.boost.week05.lesson001.sets;

import java.util.Comparator;

public class OrderNamesComparator implements Comparator<Student>{

	
	@Override
	public int compare(Student o1, Student o2) {
	
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
