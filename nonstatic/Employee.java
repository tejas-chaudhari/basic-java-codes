package com.nonstatic;

public class Employee {

	String name;
	String id;
	double salary;
	
	
	static int count;
	{
	}
	
	Employee(String name,double salary)
	{
		this();
		this.name =name;
		this.salary=salary;
		Company.count++;
	}
	Employee()
	{
		count++;
		id="capg"+count;
	}
}
