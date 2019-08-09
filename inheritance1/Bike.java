package com.inheritance1;

public class Bike extends Vehicle {

	int cc;
	
	public static void main(String[] args) {
		Bike b=new Bike();
		System.out.println("bike");
		b.move();
	}
}
