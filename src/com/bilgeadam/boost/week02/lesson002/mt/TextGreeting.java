package com.bilgeadam.boost.week02.lesson002.mt;

public class TextGreeting {

	public static void main(String[] args) {
		
		ConsoleGreeting greeting = new ConsoleGreeting();
		greeting.talk();
		
		GUIGreeting guigreeting = new GUIGreeting();
		guigreeting.talk();
		
		AngryGreeting angry = new AngryGreeting();
		angry.talk();
	}
}
