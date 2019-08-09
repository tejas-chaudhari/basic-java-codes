package com.hashset;

public class Student {

	int rollno;
	String name;
	Student(){}
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "rollno is="+rollno+" name="+name;
	}
	
	public int hashCode()
	{
		int hc=0;
	    hc=rollno+name.hashCode();
		return hc;
	}
	
	public boolean equals(Object ob)
	{
		Student ob1=(Student)ob;
		return this.name==ob1.name && this.rollno==ob1.rollno;
		
	}
}
