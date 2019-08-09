package com.Abs;

public class RightAngleTriangle implements Shape{

	double height;
	double base;
	
	 RightAngleTriangle(int height ,int base) {

		this.height=height;
		this.base=base;
	}
	
	 public double area()
	 {
		 return (height*base)/2;
	 }
	
}
