package com.bilgeadam.boost.week08.lesson002.ex;

import java.util.ArrayList;

public class ex {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
		    switch (i) {
		        case 0 :
		        System.out.println("Ahmet");
		        break;
		        case 1 :
		        System.out.println("Ayse");
		        case 2 :
		        System.out.println("Hakan");
		        break;
		        default :
		        System.out.println("isim yok");
		        break;
		    }
		
		}
	}

}
