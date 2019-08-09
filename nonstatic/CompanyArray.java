package com.nonstatic;

public class CompanyArray {
public static void main(String[] args) {
	

	Employee[]e =new Employee[3];
	e[0]=new Employee("Dinga",10000);
	e[1]=new Employee("Dingi",20000);
	e[2]=new Employee("Tejas",30000);
	
	for(int i=0;i<e.length;i++)
	{
		System.out.println("name:"+e[i].name+" id:"+e[i].id+" salary:"+e[i].salary);
	}
}	
}
