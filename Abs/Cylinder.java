package com.Abs;

public class Cylinder implements Shape{

double radius;
double height;

 Cylinder(double radius,double height) {
	 this.radius=radius;
	 this.height=height;
}
 public double area()
 {
	 return (2*PI*radius*height)+(2*PI*radius*radius);
 }
}
