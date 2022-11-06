package com.bilgeadam.boost.week10.lesson001;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class RegularExpressions {

	public static void main(String[] args) {
		
	
		
		
//		String[] list = { "dag", "deniz", "cam", "Kod"};
//		
//		for (String input: list) {
//			boolean cikti = Pattern.matches("d.+", list);
//            System.out.println(list);
//		}
			

		    // Verilen formatı derleme alanı. Yani buraya göre kontrol yapılacak
		    Pattern eslesme = Pattern.compile("sayidd");

		    // şimdi eşleşmeyi kontrol etmesi için Matcher hazırladık
		    Matcher kontrol = eslesme.matcher("sayi12");
		    if (kontrol.matches()) {
		        System.out.println(true);
		    }

		    // ve eşleşme varsa veya yoksa sonuc olan boolean değişkenimizi döndürdük.
		    kontrol = eslesme.matcher("say456");
		    if (kontrol.matches()) {
		        System.out.println(true);
		    }
		
	}

}
