package com.toString;

public class Employee {

	int id;
    String name;
	double salary;
	
	Employee(){}
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public String toString()
	{
		return "id is:"+id+" name is: "+name+" salary is:"+salary;
	}
}
