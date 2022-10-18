package com.bilgeadam.boost.week02.lesson004.mt;

public class IfTest {

	public static void main(String[] args) {
		double salesTotal = 123.45;
		double commission = 0;
		
		double commissionRate = 0.0;
		
		if (salesTotal > 100) {
			commissionRate = 0.5;
			
			commission = salesTotal * commissionRate;
		}
		
		System.out.println("Alinan komisyon: " + commission);
		
		if (salesTotal > 200) {
			commissionRate = 0.3;
			commission = salesTotal * commissionRate;
		}else {
			commissionRate = 0.2;
			commission = salesTotal * commissionRate;		
		}
		
		System.out.println("Alinan komisyon: " + commission);
	}

}