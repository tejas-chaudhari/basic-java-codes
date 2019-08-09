package com.Abs;

public class Rectangle implements Shape {

	int height;
	int breadth;
	
	Rectangle(int height,int breadth) {
		this.height=height;
		this.breadth=breadth;
	}
	
	public double area()
	{
		return height*breadth;
	}
}
