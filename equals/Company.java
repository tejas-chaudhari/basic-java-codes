package com.equals;

public class Company {

	public static void main(String[] args) {
		Employee ob=new Employee(1,"tejas",31000);
		System.out.println(ob.toString());
		Employee ob1=new Employee(1,"tejas",31000);
		System.out.println(ob1.toString());
//		Employee ob2=new Employee(3,"akash",33000);
//		System.out.println(ob2.toString());
//		Developer ob3=new Developer(4,"keyur",34000,"java");
//		System.out.println(ob3.toString());
		
		System.out.println(ob.equals(ob1));
	}
}
