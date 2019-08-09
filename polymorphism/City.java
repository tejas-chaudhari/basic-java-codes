package com.polymorphism;

public class City extends Car{

	String type;
	City(String name, double mileage, String colour,String type) {
		super(name, mileage, colour);
        this.type=type;
	}
	
	@Override
	void move(String location)
	{
		System.out.println(type+" car is moving towards "+location);
	}
}

