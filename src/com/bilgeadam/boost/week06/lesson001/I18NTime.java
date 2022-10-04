package com.bilgeadam.boost.week06.lesson001;

import java.util.Date;
import java.text.DateFormat;
import java.time.Clock;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class I18NTime {

	public static void main(String[] args) {
		
		printTime(Locale.UK);
		printTime(Locale.US);
		printTime(Locale.CANADA);
		printTime(Locale.CHINA);
		printTime(Locale.FRANCE);
		printTime(Locale.GERMANY);
		printTime(Locale.JAPAN);

	}
	
	public static void printTime(Locale locale) {
		double number = 105000.1234;
		
		DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
		
		Date currentTime = new Date();
		
		
		System.out.println(currentTime + " " + locale);
	}
}
