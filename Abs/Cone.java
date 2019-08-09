package com.Abs;

public class Cone implements Shape {

	double radius;
	double height;
	
	Cone(double radius,double height)
	{
		this.radius=radius;
		this.height=height;
	}
	
	public double area()
	{
		return PI*radius*(radius+(Math.sqrt((height*height)+(radius*radius))));
	}
}
