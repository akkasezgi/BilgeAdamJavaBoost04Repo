package com.bilgeadam.boost.week08.lesson001.at;

public class CreateAThreadRunnable implements Runnable {

	
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		CreateAThreadRunnable runnable = new CreateAThreadRunnable();
		Thread thread = new Thread(runnable, "my new thread");
		System.out.println(thread.getName());
		thread.start();
	}

	

}
