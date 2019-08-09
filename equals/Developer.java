package com.equals;

public class Developer extends Employee {

	String lang;
	
	Developer()
	{
		
	}
	Developer(int id,String name,double salary,String lang)
	{
		super(id,name,salary);
		this.lang=lang;
		
	}
	public String toString()
	{
		return super.toString()+" language is:"+lang;
	}
	
	public boolean equals(Object ob)
	{
		Developer temp=(Developer)ob;
		return super.equals(ob) && this.lang==temp.lang;
		
	}
}
