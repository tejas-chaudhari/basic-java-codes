package com.poly;

public class BMW extends Car{

	BMW(String name, double mileage,String type) {
		super(name, mileage, type);
        this.type=type;
	}
	
	@Override
	void move(String location)
	{
		System.out.println(type+" car is moving towards "+location);
	}
}

