package com.assignments;

public class Vehicle {

	String name;
	String uno;
	static int count;

	Vehicle(String name)
	{
		this();
		this.name=name;
	}
	
	Vehicle()
	{
		count++;
		uno="mh"+count;
	}
}
