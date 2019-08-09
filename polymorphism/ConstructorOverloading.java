package com.polymorphism;

public class ConstructorOverloading {

	ConstructorOverloading()
	{
		System.out.println("from constructor()");
	}
	
	ConstructorOverloading(int i)
	{
		System.out.println("from constructor(int)");
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading ob=new ConstructorOverloading();
		ConstructorOverloading ob1=new ConstructorOverloading(1);
		
	}
}
