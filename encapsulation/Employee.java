package com.encapsulation;

public class Employee {

	String name;
	private int id;
	
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public int get()
	{
		return id;
	}
}
