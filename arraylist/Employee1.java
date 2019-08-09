package com.arraylist;

public class Employee1 {

	int id;
	String name;
	double salary;
	
	Employee1()
	{
		
	}
	
	Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee id is:"+id+" Employee name is:"+name+" salary is:"+salary;
	}
	
	
	
}
