package com.bilgeadam.boost.week06.lesson001;

import java.util.Locale;

public class LocaleLesson {

	public static void main(String[] args) {
		
		Locale locale = new Locale("tr", "TR");
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getISO3Language());
		System.out.println();
	}

}
