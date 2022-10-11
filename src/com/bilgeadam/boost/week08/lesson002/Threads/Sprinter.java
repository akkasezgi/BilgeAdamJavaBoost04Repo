package com.bilgeadam.boost.week08.lesson002.Threads;

import java.util.Date;

import com.bilgeadam.boost.week08.lesson001.at.ThreadPriorityExample;

public class Sprinter extends Thread implements Runnable {

	String spr1;
	Double distance;
	Double time;
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i+= 10) {
			System.out.println(Thread.currentThread().getName());
		}
		super.run();
	}
	
	
	public static void main(String[] args) {
		
		ThreadPriorityExample t3 = new ThreadPriorityExample();
		System.out.println(t3.getPriority() +" "+ t3.getName());
		t3.start();
		
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/*
	 * 
	 */
}
