package com.assignments;

public class Bike {

	String name;
	int mileage;
	Engine e;
	
	Bike(String name,int mileage,Engine e)
	{
		this.name=name;
		this.mileage=mileage;
		this.e=e;
	}
	
	public static void main(String[] args) {
		Bike b=new Bike("wego",25,new Engine(110));
		System.out.println("bike name is: "+b.name);
		System.out.println("mileage is: "+b.mileage);
		System.out.println("cc is:"+b.e.cc);
		
	}

}
