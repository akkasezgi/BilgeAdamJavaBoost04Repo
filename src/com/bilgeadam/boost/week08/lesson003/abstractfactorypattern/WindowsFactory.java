package com.bilgeadam.boost.week08.lesson003.abstractfactorypattern;

public class WindowsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		
		return new WindowsCheckbox();
	}

}
