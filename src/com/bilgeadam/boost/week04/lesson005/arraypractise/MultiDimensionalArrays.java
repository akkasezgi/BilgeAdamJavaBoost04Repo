package com.bilgeadam.boost.week04.lesson005.arraypractise;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		int[] [] myNumbers = { {1, 2, 3, 4}  ,{5, 6, 7} };
		
		int x = myNumbers [1][2];
		
		System.out.println(myNumbers.length);
		System.out.println(myNumbers[1].length);
		
		for (int i = 0; i<myNumbers.length; i++) {
			for(int j = 0; j<myNumbers[i].length; j++) {
				System.out.print(myNumbers[i][j]);
				
			}
		}
		

	}

}
