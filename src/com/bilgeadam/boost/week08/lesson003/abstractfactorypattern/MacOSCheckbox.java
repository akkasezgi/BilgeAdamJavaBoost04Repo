package com.bilgeadam.boost.week08.lesson003.abstractfactorypattern;

public class MacOSCheckbox implements Checkbox {

	@Override
	public void configure() {
		System.out.println("You have created WindowsCheckbox");
	}
	
}
