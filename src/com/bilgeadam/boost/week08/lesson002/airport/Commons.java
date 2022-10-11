package com.bilgeadam.boost.week08.lesson002.airport;

import java.util.HashSet;


	public class Commons {
		private static Commons   instance;
		private HashSet<Vehicle> vehicles;

		private Commons() {
			this.vehicles = null;
		}

		public static Commons getInstance() {
			if (Commons.instance == null) {
				Commons.instance = new Commons();
			}
			return Commons.instance;
		}

		public HashSet<Vehicle> getVehicles() {
			if (this.vehicles == null) {
				this.vehicles = new HashSet<>();
			}
			return this.vehicles;
		}
	

}
