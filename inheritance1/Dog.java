package com.inheritance1;

public class Dog extends Animal{

	String breed;
	
	Dog(double height,double weight,String breed)
	{
		super(height,weight);
		
		this.breed=breed;
	}
	
}
