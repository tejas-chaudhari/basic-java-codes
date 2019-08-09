package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class HM3 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Employee> emp=new HashMap<>();
		emp.put(1,new Employee(1,"tejas"));
		emp.put(2,new Employee(2,"akash"));
		emp.put(3,new Employee(3,"raj"));
		emp.put(4,new Employee(4,"keyur"));
		System.out.println(emp);
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter id of employee you want to search");
		int i=sc.nextInt();
		if(emp.containsKey(i))
		{
			Employee e= emp.get(i);
			System.out.println("id is:"+e.id);
			System.out.println("name is:"+e.name);
		}
	}

}
