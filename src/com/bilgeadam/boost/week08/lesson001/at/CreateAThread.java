package com.bilgeadam.boost.week08.lesson001.at;

public class CreateAThread extends Thread{

	@Override
	public void run() {
		System.out.println("Thread is running");
	}
	 public static void main(String[] args) {
		CreateAThread thread = new CreateAThread();
		thread.start();
		
	}
	

}
