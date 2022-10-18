package com.bilgeadam.boost.week08.lesson003.abstractfactorypattern;

public class Test {

	public static void main(String[] args) {


		configureApplication().configure();

	}
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("osName").toLowerCase();
		System.out.println(osName);
		
		if(osName.contains("Mac")) {
			factory = new MacOSFactory();
		}else {
			factory = new WindowsFactory();
			}
			
			app = new Application(factory);
			return app;
			
		
	}

}
