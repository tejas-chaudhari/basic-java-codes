package com.polymorphism;

public class Vehicle {

	String name;
	double mileage;
	
	Vehicle(String name,double mileage)
	{
	this.name=name;
	this.mileage=mileage;
	}
	void move()
	{
		System.out.println("vehicle is moving");
	}
	void move(String location)
	{
		System.out.println("vehicle id moving "+location);
	}
}
