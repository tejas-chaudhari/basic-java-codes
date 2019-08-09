package com.arraylist;

public class Bike {

	String name;
	double mileage;
	
	Bike(){
		
	}
	
	Bike(String name, double mileage) {
		this.name = name;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Bike name=" + name + ", Bike mileage=" + mileage;
	}	
}
