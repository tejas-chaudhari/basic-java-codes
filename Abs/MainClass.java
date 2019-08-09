package com.Abs;

public class MainClass {

	public static void main(String[] args) {
		
		Shape ob=new Circle(10);
		System.out.println("area of circle: "+ob.area());
		Shape ob2=new Rectangle(10,5);
		System.out.println("area of rectangle: "+ob2.area());
		Shape ob3=new Square(10);
		System.out.println("area of Square: "+ob3.area());
		Shape ob4=new RightAngleTriangle(10,5);
		System.out.println("area of right angle traingle: "+ob4.area());
		Shape ob5=new Cylinder(10,5);
		System.out.println("area of cylinder: "+ob5.area());
		Shape ob6=new Cone(2,10);
		System.out.println("area of cone: "+ob6.area());
	}
}
