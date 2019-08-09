package com.arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList ls1=new ArrayList();
		ls1.add(new Bike("wego",25));
		ls1.add(new Bike("Discover",50));
		ls1.add(new Bike("jupiter",30));
		
		ArrayList ls2=new ArrayList();
		ls2.add(new Employee(1));
		ls2.add(new Employee(2));
		ls2.add(new Employee(3));
		
		ArrayList ls3=new ArrayList();
		ls3.add(new Student(1));
		ls3.add(new Student(2));
		ls3.add(new Student(3));
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Bike");
		for(int i=0;i<ls1.size();i++)
			System.out.println(ls1.get(i));
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Employee");
		for(int i=0;i<ls2.size();i++)
			System.out.println(ls2.get(i));
		
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("student");
		for(int i=0;i<ls2.size();i++)
			System.out.println(ls3.get(i));
		
	}
}
