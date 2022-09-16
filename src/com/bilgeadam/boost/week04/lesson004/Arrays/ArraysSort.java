package com.bilgeadam.boost.week04.lesson004.Arrays;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
	
		int [] list = {56, 34, 1, 8, 101, -2, -33};
		int max = 0;
//		Arrays.sort(list);
//		int n = list.length;
//			System.out.println(largest(list,n));
//			
//		
//	}
//	static int largest(int []list, int n) {
//       Arrays.sort(list);
//       return list[n - 1];

		for(int i = 0; i < list.length; i++) {
		if(list[i] > max) {
            max = list[i];
           
        }
	System.out.println(max);
}
		
	}
}
