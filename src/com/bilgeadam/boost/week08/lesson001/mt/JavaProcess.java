package com.bilgeadam.boost.week08.lesson001.mt;

public class JavaProcess {

	public static void main(String[] args) {
		System.out.println("name: " + Thread.currentThread().getName());
		System.out.println("Id: "   + Thread.currentThread().getId());
		System.out.println("Oncelik"+ Thread.currentThread().getPriority());
		System.out.println("durum"  + Thread.currentThread().getState());
		System.out.println("ClassLo"+ Thread.currentThread().getContextClassLoader());
		System.out.println("grup"   + Thread.currentThread().getThreadGroup());
		
		

	}

}
