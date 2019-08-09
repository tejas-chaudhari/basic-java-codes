package com.inheritance2;

public class company {

	static void display(Employee x)
	{
		System.out.println("name is: "+x.name);
		System.out.println("id is: "+x.id);
		if(x instanceof FSDev)
		System.out.println("lang is: "+((FSDev)x).lang);
	}
	public static void main(String[] args) {
		Employee ob=new FSDev("tejas",1,"java");//upcasting
		Employee ob1=new FSDev("raj",2,"python");
//		FSDev ob3=(FSDev)ob1;
//		System.out.println(ob1 instanceof FSDev);
		display(ob1);
		display(ob);
		Employee ob2=new Employee("raj",2);
		display(ob2);
	}
}
