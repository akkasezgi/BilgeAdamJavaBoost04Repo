package com.bilgeadam.boost.week08.lesson002.airport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Airport implements Passable {
	

		private static final ApplicationLogger logger   = ApplicationLogger.INSTANCE;
		private static final int               CAPACITY = 1;
		private volatile AtomicInteger         numOfPlanes;
		private final String                   name;
		private final List<Vehicle>            waitingList;
		private final List<Vehicle>            synchWaitingList;
		
		public Airport(String name) {
			super();
			this.name        = name;
			this.numOfPlanes = new AtomicInteger(0);
			this.waitingList = new ArrayList<>();
			this.synchWaitingList = Collections.synchronizedList(waitingList);
		}

		public String getName() {
			return this.name;
		}

		@Override
		public synchronized void enter(Vehicle vehicle) throws InterruptedException {
			this.synchWaitingList.add(vehicle);

			if (!isAbleToEnter(vehicle)) {
				logger.basic(this.numOfPlanes.get() + " planes at <<<<" + this.name + ">>> Airport");
				wait();
			}
		}

		private synchronized boolean isAbleToEnter(Vehicle vehicle) {
			int pos = this.synchWaitingList.indexOf(vehicle);
			logger.basic(vehicle.getVehicleName() + " is at the <<<" + pos + ">>> position");

			if ((this.numOfPlanes.get() >= Airport.CAPACITY) || (pos > 0)) {
				return false;
			}
			this.synchWaitingList.remove(vehicle);
			int num = this.numOfPlanes.incrementAndGet();
			logger.basic(num + " planes at " + this.name + " Airport");
			return true;
		}

//		@Override
//		public synchronized void enter(Vehicle vehicle) throws InterruptedException {
//			this.waitingList.add(vehicle);
//			int pos = this.waitingList.indexOf(vehicle);
//			logger.basic(vehicle.getVehicleName() + " is at the " + pos + " position");
//			
//			if ((this.numOfPlanes.get() >= Airport.CAPACITY) || (pos > 0)) {
//				logger.basic(this.numOfPlanes.get() + " planes at " + this.name + " Airport");
//				wait();
//			}
//			int num = this.numOfPlanes.incrementAndGet();
//			this.waitingList.remove(vehicle);
//			logger.basic(num + " planes at " + this.name + " Airport");
//		}

		@Override
		public synchronized void leave(Vehicle vehicle) {
			this.numOfPlanes.decrementAndGet();
			notifyAll();
		
	}

}
