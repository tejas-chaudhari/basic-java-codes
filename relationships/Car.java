package com.relationships;

public class Car {

	String colour;
	int mileage;
	Engine e;
	
	Car(String colour,int mileage,Engine e)
	{
		this.colour=colour;
		this.mileage=mileage;
		this.e=e;
	}
	
	public static void main(String[] args) {
		
		Car c=new Car("red",21,new Engine(1500));
		System.out.println("colour of car is: "+c.colour );
		System.out.println("milage of car is: "+c.mileage);
		System.out.println("CC of engine is: "+c.e.cc);
		
	}
}
