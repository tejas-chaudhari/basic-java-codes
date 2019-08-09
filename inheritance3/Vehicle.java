package com.inheritance3;

public class Vehicle {

	String name;
	String uno;
	static int count;
	
	Vehicle(String name)
	{
		this();
		this.name=name;
		Bike.count++;
	}
	
	
	
	Vehicle()
	{
		count++;
		uno="MH"+count;
	}
}
