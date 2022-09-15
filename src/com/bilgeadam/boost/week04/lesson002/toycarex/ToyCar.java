package com.bilgeadam.boost.week04.lesson002.toycarex;

import java.util.Scanner;

public class ToyCar {

	private int batteryCapacity;
	int distanceX;
	int distanceY;
	
	
	void initToyCar() {
		
		ToyCar toycar = new ToyCar();
		Scanner sc = new Scanner(System.in);
		System.out.println("w-Move Forward\na-Move Left\ns-Move Backward\nd-Move Right\nc-Charge\nWhat you gonna do?");
		String move = sc.nextLine();
		boolean exit = true;
		while(exit) {
		switch (move.toLowerCase()) {
		case "w":
			toycar.moveOnMeterForward();
			break;
		case "a":
			toycar.moveOnMeterLeft();
			break;
		case "s":
			toycar.moveOnMeterBackward();
			break;
		case "d":
			toycar.moveOnMeterRight();
			break;
		case "c":
			toycar.charge();
			break;
		case "e":
			exit=false;
			break;
		default:
			System.out.println("Invalid entry!!!!");
			break;
		}
		}
	}
	
	private void moveOnMeterForward() {
		if(batteryCapacity<=0) {
			
    	}else{ 
    		distanceX++;
		    batteryCapacity--;
		    currentPosition();
		    }
		    batteryRemaining();
	}
	private void moveOnMeterLeft() {
		if(batteryCapacity<=0) {
			
    	}else{ 
    		distanceY++;
		    batteryCapacity--;
		    currentPosition();
		    batteryRemaining();}
	}
	private void moveOnMeterBackward() {
		if(batteryCapacity<=0) {
			
    	}else{ 
    		distanceX--;
		    batteryCapacity--;
		    currentPosition();
		    batteryRemaining();}
	}
	private void moveOnMeterRight() {
	
	    if(batteryCapacity<=0) {
		
	    }else{ 
		   distanceY++;
	       batteryCapacity--;
	       currentPosition();
	    }
	       batteryRemaining();
	}
	private void currentPosition() {
		System.out.println("Current position : " + distanceX +","+ distanceY);
		
	}
	
		
	private void batteryRemaining() {
		
		System.out.println("Remaining battery : "+ batteryCapacity );
		if (this.batteryCapacity <0 ) {
			System.err.println("dead battery! Please charge ");
		}
	}
	
	void charge() {
		if (batteryCapacity >= 5) {
			System.out.println("Battery full!");
		} else {
			batteryCapacity++;
			batteryRemaining();
		}
	}

	
	@Override
	public String toString() {
		return "ToyCar [batteryCapacity=" + batteryCapacity + ", distanceX=" + distanceX + ", distanceY=" + distanceY
				+ "]";
	}

	public ToyCar() {
	
		this.batteryCapacity=5;
		this.distanceX=0;
		this.distanceY=0;
	}

	public ToyCar(int batteryCapacity, int distanceX, int distanceY) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.distanceX = distanceX;
		this.distanceY = distanceY;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getDistanceX() {
		return distanceX;
	}

	public void setDistanceX(int distanceX) {
		this.distanceX = distanceX;
	}

	public int getDistanceY() {
		return distanceY;
	}

	public void setDistanceY(int distanceY) {
		this.distanceY = distanceY;
	}
	
	
	
}
