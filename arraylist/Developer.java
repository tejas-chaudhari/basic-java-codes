package com.arraylist;

public class Developer extends Employee1{

	String lang;

	Developer()
	{
		
	}

	Developer(int id, String name, double salary, String lang) {
		super(id, name, salary);
		this.lang = lang;
	}
	
	public String toString()
	{
		return super.toString()+ " developer language is:"+lang;
	}
	
}
