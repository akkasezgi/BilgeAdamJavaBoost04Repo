package com.bilgeadam.boost.week04.lesson005.arraypractise;


import java.util.Arrays;


public class ArraySorting {

	public static void main(String[] args) {
	
		int[] arrays = {3,7,3,12,43,54,43,28,3,19,-24,-19};
		

		for (int i=0; i<arrays.length; i++) {
			
			for (int j=i+1; j<arrays.length; j++) {
				int temp=0;
				if (arrays[j]<arrays[i]) {
					
					temp = arrays[i];
					arrays[i]=arrays[j];
					arrays[j]=temp;
				}
			}
//			System.out.println(Arrays.toString(arrays));
		}
		for (int i=0; i<arrays.length; i++) {
			System.out.print(arrays[i]+"\t");
		}

		
//		Collections.sort(arrays);
//		System.out.println(arrays);
		
		
	}

}
