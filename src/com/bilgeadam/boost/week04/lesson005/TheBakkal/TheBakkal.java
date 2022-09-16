package com.bilgeadam.boost.week04.lesson005.TheBakkal;

import java.time.LocalDate;

import com.bilgeadam.boost.week04.lesson005.TheBakkal.AnimalProductType;
import com.bilgeadam.boost.week04.lesson005.TheBakkal.MilkProduct;
import com.bilgeadam.boost.week04.lesson005.TheBakkal.UnitType;

public class TheBakkal {
	
	public static void main(String[] args) {
		MilkProduct cheese = new MilkProduct("Beyaz Peynir", UnitType.KG, 85.56, 5, LocalDate.of(2022, 5, 22), 
												AnimalProductType.GOAT_LAMB, false, true);
		
//		cheese.setBottled(false);
//		cheese.setLactoseFree(true);
//		cheese.setProductionDate(LocalDate.of(2022, 5, 22));
//		cheese.setQuantity(5);
//		cheese.setName("Beyaz Peynir");
//		cheese.setType(AnimalProductType.GOAT_LAMB);
//		cheese.setUnit(UnitType.KG);
//		cheese.setUnitPrice(85.56);
		System.out.println(cheese.getUnit().name());
		System.out.println(cheese);
		
		MilkProduct milk = new MilkProduct("Tam Yağlı Süt", UnitType.Liter, 30.0, 15, LocalDate.of(2022, 9, 8), 
				AnimalProductType.COW, true, false);
		System.out.println(milk);

		System.out.println("Peynir bayat mı? " + cheese.expired());
		System.out.println("Süt bayat mı?    " + milk.expired());
		if (!milk.expired()) {
			System.out.println("Sütü en fazla " + milk.getDaysToPerish() + " gün içinde satmalısınız");
		}
	}
	
/*	
	public static void main(String[] args) {
//		Product p1 = new Product();
//		System.out.println(p1);
		
		MilkProduct m1 = new MilkProduct();
		System.out.println(m1);
		
		// MilkProduct m2 = p1;  ==> bu olmaz. Çünkü dar veri türünü geniş veri türüne atamaya java izin vermez. 
//												 Her zaman Özel bir varlığı genele atayabiliriz ama ters yönde TYPECASTING yapmak gerekr
		Product p2 = null;  
		System.out.println("P2: " + p2);
		
		p2 = m1;  
		System.out.println("P2: " + p2);
		
		Product p3 = new MilkProduct();
		((MilkProduct)p3).setType(AnimalProductType.GOAT);  // runtime sırasında Java hangi sınıfla çalıştığını biliyor ve ona göre davranıyor
														  // programı yazarken eğer bir alt sınıfı üst sınıfa atadı isek, alt sınıfın
														  // özelliklerine ulaşmak için type-casting yapmamız gerekli
		
		System.out.println("P3: " + p3);
		
		BakeryProduct b1 = new BakeryProduct();
		System.out.println(b1);
		
		p2 = b1;  
		System.out.println("B1: " + p2);
	}
*/
}