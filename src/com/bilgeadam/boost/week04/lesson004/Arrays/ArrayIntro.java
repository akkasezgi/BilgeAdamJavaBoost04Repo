package com.bilgeadam.boost.week04.lesson004.Arrays;

import java.util.Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		 int [] data;
		 data = new int [4];
		 
//		 int [] data = new int [10];
		 
		 double [] datas = new double [12];
		 
		 int [] age = {14, 15, 23, 45, 0};
		 
//		 System.out.println(age[1]);
//		 System.out.println(Arrays.toString(age));
//		 for (int i=0; i < age.length; i++) {
//			 System.out.print(age [i]+"\t");
//		 }
//		 
//		 for (int i : age) {
//			 System.out.print(i+"\t");
//		}
		 
		 age [4] = 10;
		 System.out.println(age[4]);
		 
		 
		 
		 data[0] = 12;
		 data[1] = 6;
		 data[2] = 5;
		 

	}

}
