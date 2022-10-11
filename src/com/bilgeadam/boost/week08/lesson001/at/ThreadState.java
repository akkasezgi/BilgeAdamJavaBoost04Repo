package com.bilgeadam.boost.week08.lesson001.at;

public class ThreadState implements Runnable{

	public Thread t1;
	public static ThreadState ts;
	
	
	
	@Override
	public void run() {
		SomeThread someThread = new SomeThread();
		Thread t2 = new Thread(someThread);
		t2.start();
		System.out.println("t2 start olduktan sonra state:  "+ t2.getState());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		System.out.println("t2 sleep olduktan sonra state:  "+ t2.getState());
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("t2 join yaptıktan sonra state:  "+ t2.getState());
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		ts = new ThreadState();
//		t1 = new Thread(ts);
//		t1.getState();
}
}