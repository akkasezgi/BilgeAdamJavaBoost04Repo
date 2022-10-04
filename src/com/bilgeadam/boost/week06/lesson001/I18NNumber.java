package com.bilgeadam.boost.week06.lesson001;

import java.text.NumberFormat;
import java.util.Locale;

public class I18NNumber {

	public static void main(String[] args) {
		
		printNumber(Locale.UK);
		printNumber(Locale.US);
		printNumber(Locale.CANADA);
		printNumber(Locale.CHINA);
		printNumber(Locale.FRANCE);
		printNumber(Locale.GERMANY);
		printNumber(Locale.JAPAN);

	}

	
	static void printNumber(Locale locale) {
		double number = 105000.1234;
		
		NumberFormat formatter = NumberFormat.getNumberInstance();
		String formatNumber = formatter.format(number);
		System.out.println(formatNumber + " " + locale);
	}
}
