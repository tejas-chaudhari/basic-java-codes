package com.polymorphism;

public class Car extends Vehicle{

	String colour;
	
	Car(String name, double mileage,String colour) {
		super(name, mileage);
		this.colour=colour;
	}
	
	@Override
	void move()
	{
		System.out.println("car is moving smoothly");
	}
}
