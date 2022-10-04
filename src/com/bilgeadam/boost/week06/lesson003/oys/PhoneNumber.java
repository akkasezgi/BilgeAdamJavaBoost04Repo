package com.bilgeadam.boost.week06.lesson003.oys;

public class PhoneNumber {
	
	private long mobilePhoneNumber;
	private long parentPhoneNumber;
	private long homePhoneNumber;
	
	
	
	public PhoneNumber() {
		super();
	}



	public PhoneNumber(long mobilePhoneNumber, long homePhoneNumber) {
		super();
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.homePhoneNumber = homePhoneNumber;
	}



	public PhoneNumber(long mobilePhoneNumber, long parentPhoneNumber, long homePhoneNumber) {
		super();
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.parentPhoneNumber = parentPhoneNumber;
		this.homePhoneNumber = homePhoneNumber;
	}



	public long getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}



	public void setMobilePhoneNumber(long mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}



	public long getParentPhoneNumber() {
		return parentPhoneNumber;
	}



	public void setParentPhoneNumber(long parentPhoneNumber) {
		this.parentPhoneNumber = parentPhoneNumber;
	}



	public long getHomePhoneNumber() {
		return homePhoneNumber;
	}



	public void setHomePhoneNumber(long homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}



	@Override
	public String toString() {
		return "PhoneNumber [mobilePhoneNumber=" + mobilePhoneNumber + ", parentPhoneNumber=" + parentPhoneNumber
				+ ", homePhoneNumber=" + homePhoneNumber + "]";
	}
	
	
	
	
	

}
