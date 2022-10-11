package com.bilgeadam.boost.week08.lesson002.airport;

import java.util.StringTokenizer;


	public class Airplane extends Vehicle {
		private String    company;
		private final int capacity;

		public Airplane(String name, String company, int capacity, int maxSpeed) {
			this.company  = company;
			this.capacity = capacity;
			this.setVehicleName(name);
			this.setMaxSpeed(maxSpeed);
			do {
				this.timeInAir = this.rnd.nextInt(10) * 1000;
			} while (this.timeInAir == 0);
			do {
				this.timeAtAirport = this.rnd.nextInt(10) * 2000;
			} while (this.timeAtAirport == 0);
		}

		public static void parse(String line) {
			// Type;Name;MaxSpeed;Company;Capacity;Purpose
			// AIRPLANE;Toros;600;THY;230;
			StringTokenizer tokenizer = new StringTokenizer(line, ";");
			tokenizer.nextToken(); // AIRPLANE
			String   name     = tokenizer.nextToken();
			int      maxSpeed = Integer.parseInt(tokenizer.nextToken());
			String   company  = tokenizer.nextToken();
			int      capacity = Integer.parseInt(tokenizer.nextToken());
			Airplane airplane = new Airplane(name, company, capacity, maxSpeed);
			Commons.getInstance().getVehicles().add(airplane);
		}

		public String getCompany() {
			return this.company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public int getCapacity() {
			return this.capacity;
		}

		@Override
		public String toString() {
			return "Airplane [company=" + this.company + ", capacity=" + this.capacity + ", getVehicleName()="
					+ this.getVehicleName() + ", getTimeInAir()=" + this.getTimeInAir() + ", getTimeAtAirport()="
					+ this.getTimeAtAirport() + ", getAirport()=" + this.getAirport() + "]";
		}

	


}
