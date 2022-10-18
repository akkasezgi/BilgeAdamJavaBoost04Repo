package com.bilgeadam.boost.week08.lesson003.abstractfactorypattern;

public class Application {
	private Button button;
	private Checkbox checkbox;
	public Application (GUIFactory factory) {
		
		button = factory.createButton();
		checkbox = factory.createCheckbox();
		
	}

	public void configure() {
		button.congigure();
		checkbox.configure();
	}
}
