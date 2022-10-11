package com.bilgeadam.boost.week08.lesson002.airport;



	import java.util.Random;


	public abstract class Vehicle extends Thread {
		protected ApplicationLogger logger = ApplicationLogger.INSTANCE;

		private String   vehicleName;
		private int      maxSpeed;
		protected Random rnd = new Random();
		protected int    timeInAir;
		protected int    timeAtAirport;
		private Airport  airport;

		public String getVehicleName() {
			return this.vehicleName;
		}

		public void setVehicleName(String vehicleName) {
			this.vehicleName = vehicleName;
		}

		public int getMaxSpeed() {
			return this.maxSpeed;
		}

		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}

		public int getTimeInAir() {
			return this.timeInAir;
		}

		public void setTimeInAir(int timeInAir) {
			this.timeInAir = timeInAir;
		}

		public int getTimeAtAirport() {
			return this.timeAtAirport;
		}

		public void setTimeAtAirport(int timeAtAirport) {
			this.timeAtAirport = timeAtAirport;
		}

		@Override
		public void run() {
			try {
				while (true) {
					logger.basic(">>> approaching " + this.getVehicleName() + " to " + this.getAirport().getName() +  " Airport");
					Thread.sleep(timeInAir);
					logger.basic("+++ entered " + this.getVehicleName() + " in " + this.getAirport().getName() +  " Airport");
					this.airport.enter(this);
					
					logger.basic("ooo is " + this.getVehicleName() + " at " + this.getAirport().getName() +  " Airport");
					Thread.sleep(timeAtAirport);
					logger.basic("<<< " + this.getVehicleName() + " leaving " + this.getAirport().getName() +  " Airport");
					this.airport.leave(this);
					logger.basic("--- has left " + this.getVehicleName() + " " + this.getAirport().getName() +  " Airport");
				}
			}
			catch (InterruptedException ex) {
				throw new AssertionError(ex);
			}
		}

		public Airport getAirport() {
			return this.airport;
		}

		public void setAirport(Airport airport) {
			this.airport = airport;
		}

	


}
