package com.bilgeadam.boost.week08.lesson002.airport;

public interface Passable {

	
	void enter (Vehicle vehicle) throws InterruptedException;
	void leave (Vehicle vehicle);
}
