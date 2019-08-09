package com.treemap;

import java.util.TreeMap;

public class Company {

	public static void main(String[] args) {
		
		TreeMap<ID, Emp> emp=new TreeMap<>();
		ID id1=new ID(1);
		ID id2=new ID(2);
		Emp emp1=new Emp(id1,"dinga",31000);
		Emp emp2=new Emp(id2,"dingi",32000);
		
		emp.put(id1,emp1);
		emp.put(id2,emp2);
		
		System.out.println(emp);
		
		emp1.name="dinga dingi";
		System.out.println(emp);
		
		if(emp.containsKey(id2))
		{
			emp.remove(id2);
		}
		
		System.out.println(emp);
	}
}
