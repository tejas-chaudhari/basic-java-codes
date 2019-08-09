package com.treemap;

public class Emp {

	ID id;
	String name;
	double salary;

	Emp()
	{
		
	}
	
	Emp(ID id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return " "+name+" "+salary;
	}
	
}
