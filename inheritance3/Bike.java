package com.inheritance3;

public class Bike extends TwoWheeler {

	public static int count;
	double mileage;
	
	Bike(String colour,String name,double mileage)
	{
		super(colour,name);
		this.mileage=mileage;
	}
}
