package com.bilgeadam.boost.week04.lesson003.composition;

public class Engine {

	private MotorType type;
	private int horsePower;
	private int cylinderNumber;
	
	
	
	
	public Engine() {
		super();
	}
	
	public Engine(MotorType type, int horsePower, int cylinderNumber) {
		super();
		this.type = type;
		this.horsePower = horsePower;
		this.cylinderNumber = cylinderNumber;
	}

	
	public MotorType getType() {
		return type;
	}

	public void setType(MotorType type) {
		this.type = type;
	}

	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public int getCylinderNumber() {
		return cylinderNumber;
	}
	public void setCylinderNumber(int cylinderNumber) {
		this.cylinderNumber = cylinderNumber;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", horsePower=" + horsePower + ", cylinderNumber=" + cylinderNumber + "]";
	}
	
	
	
}
