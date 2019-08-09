package com.Interface;

public class Mensuration {

	public static void main(String[] args) {
		
		Shape s1=new Circle(2);
		System.out.println(s1.area());
		Shape s2=new Rectangle(50,20);
		System.out.println(s2.area());
	}
	
}
