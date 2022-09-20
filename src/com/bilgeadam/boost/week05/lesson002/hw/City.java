package com.bilgeadam.boost.week05.lesson002.hw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class City {
	
	private int cityCode;
	private int cityName;
	private String cityFood;
	

	
	
	public City() {
		super();
	}
	public City(int cityCode, int cityName, String cityFood) {
		super();
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.cityFood = cityFood;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public int getCityName() {
		return cityName;
	}
	public void setCityName(int cityName) {
		this.cityName = cityName;
	}
	public String getCityFood() {
		return cityFood;
	}
	public void setCityFood(String cityFood) {
		this.cityFood = cityFood;
	}
	@Override
	public String toString() {
		return "City [cityCode=" + cityCode + ", cityName=" + cityName + ", cityFood=" + cityFood + "]";
	}
	
	

}
