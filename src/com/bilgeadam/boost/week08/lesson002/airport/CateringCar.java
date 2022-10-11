package com.bilgeadam.boost.week08.lesson002.airport;

import java.util.StringTokenizer;


	public class CateringCar extends ServiceCar{
		private String cateringCompany;
		
		public CateringCar(String name, String cateringCompany, boolean serving, int maxSpeed) {
			super(name, "Catering", serving, maxSpeed);
			this.cateringCompany = cateringCompany;
		}

		public static void parse (String line) {
			// Type;Name;MaxSpeed;Company;Capacity;Purpose
			// CATERING;CATER-1;80;Do&Co;;
			StringTokenizer tokenizer = new StringTokenizer(line, ";");
			tokenizer.nextToken(); // CATERING
			String name = tokenizer.nextToken(); // CATER-1
			int maxSpeed = Integer.parseInt(tokenizer.nextToken()); // 80
			String company = tokenizer.nextToken(); // Do&Co
			CateringCar car = new CateringCar(name, company, false, maxSpeed);
			Commons.getInstance().getVehicles().add(car);
		}

		
		public String getCateringCompany() {
			return this.cateringCompany;
		}

		public void setCateringCompany(String cateringCompany) {
			this.cateringCompany = cateringCompany;
		}

		@Override
		public String toString() {
			return "CateringCar [cateringCompany=" + this.cateringCompany + ", getPurpose()=" + this.getPurpose()
					+ ", getName()=" + this.getVehicleName() + ", getMaxSpeed()=" + this.getMaxSpeed() + "]";
		}
	

}
