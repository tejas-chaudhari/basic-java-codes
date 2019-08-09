package com.poly;

public class Car extends Vehicle{

	String type;
	
	Car(String name, double mileage,String type) {
		super(name, mileage);
		this.type=type;
	}
	
	@Override
	void move()
	{
		System.out.println(type+" car is moving");
	}
}
