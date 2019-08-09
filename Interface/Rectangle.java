package com.Interface;

public class Rectangle implements Shape{

	double length;
	double breadth;
	
	Rectangle(double length,double breadth)
    {
		this.length=length;
		this.breadth=breadth;	
	}
	public double area()
	 {
		 return length*breadth;
	 }

	
}
