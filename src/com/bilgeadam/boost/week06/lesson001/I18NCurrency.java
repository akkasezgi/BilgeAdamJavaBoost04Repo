package com.bilgeadam.boost.week06.lesson001;

import java.text.NumberFormat;
import java.util.Locale;

public class I18NCurrency {

	public static void main(String[] args) {

		printCurrency(Locale.UK);
		printCurrency(Locale.US);
		printCurrency(Locale.CANADA);
		printCurrency(Locale.CHINA);
		printCurrency(Locale.FRANCE);
		printCurrency(Locale.GERMANY);
		printCurrency(Locale.JAPAN);
	}

	public static void printCurrency (Locale locale) {
		double number = 105000.1234;
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String currency = formatter.format(number);
		System.out.println(currency + " " + locale);
	}
}
