package com.bilgeadam.boost.week04.lesson005.arraypractise;

import java.util.Arrays;

public class ArrayConcat {

	public static void main(String[] args) {
		
		int [] array1 = {1, 2, 3};
		int [] array2 = {4, 5, 6};
		int [] array3 = new int [array1.length + array2.length];
		
//		System.arraycopy(array1, 0, array3, 0, array1.length);
//		System.arraycopy(array2, 0, array3, array1.length, array2.length);
		
		int pos=0;
		
		for (int i : array1) {
			array3[pos]=i;
			pos++;
			
		}
		for (int i : array2) {
			array3[pos]=i;
			pos++;
			
		}
		System.out.println(Arrays.toString(array3));
		
		
		
		

	}

}
