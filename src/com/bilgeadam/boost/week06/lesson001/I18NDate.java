package com.bilgeadam.boost.week06.lesson001;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Date;

public class I18NDate {

	public static void main(String[] args) {
		
	
		printDate(Locale.UK);
		printDate(Locale.US);
		printDate(Locale.CANADA);
		printDate(Locale.CHINA);
		printDate(Locale.FRANCE);
		printDate(Locale.GERMANY);
		printDate(Locale.JAPAN);
	}

	
	static void printDate(Locale locale) {
		double number = 105000.1234;
		
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
		
		Date currentDate = new Date();
		
		System.out.println(currentDate + " " + locale);
}
}