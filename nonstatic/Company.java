package com.nonstatic;

public class Company {
	static int count=1;
	{
		
	}

	public static void main(String[] args) {

		Employee ob=new Employee("Tejas",30000);
		System.out.println("name is:"+ob.name +" id is " +ob.id+" having salary "+ob.salary);
		
		
	Employee ob1=new Employee("Akash",31000);
		System.out.println("name is:"+ob1.name +" id is " +ob1.id+" having salary "+ob1.salary);
	
		
		Employee ob2=new Employee("Raj",32000);
		System.out.println("name is:"+ob2.name +" id is " +ob2.id+" having salary "+ob2.salary);
		
		
	}
}
