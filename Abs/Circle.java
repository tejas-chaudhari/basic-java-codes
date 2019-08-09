package com.Abs;

public class Circle implements Shape{

	int r;
	Circle(int r)
	{
		this.r=r;
	}
	
	public double area()
	{
		return PI*r*r;
	}
}
