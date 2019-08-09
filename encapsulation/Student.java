package com.encapsulation;

public class Student {

	int age;
	String name;
	int id;
	
	Student(String name,int id,int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
	void read()
	{
		System.out.println(name+"is reading");
	}
}
