package com.Interface;

public class Circle implements Shape {
	
	double r;
	
	Circle(double r)
	{
		this.r=r;
	}
	@Override
	public double area() {
		return PI*r*r;
	}
	
}
