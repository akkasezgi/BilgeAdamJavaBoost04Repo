package com.bilgeadam.boost.week08.lesson001.at;

public class JoinMethod extends Thread{
	
	public void run() {
		
		for (int i = 0; i <=5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
	}
	public static void main(String[] args) throws InterruptedException {
		JoinMethod t1 = new JoinMethod();
		JoinMethod t2 = new JoinMethod();
		JoinMethod t3 = new JoinMethod();
		
		t1.start();
		
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
