package com.bilgeadam.boost.week04.lesson002.thebakkal;

public interface Wholesaleable {
	
	default double getdiscountRate () {
		return 0.15;
	}

}
