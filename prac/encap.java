package com.prac;

public class encap {
	
	private int id;
	String name;
	
	encap()
	{
		
	}
	encap(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int get()
	{
		return id;
		
	}
	public void set( int id)
	{
		this.id=id;
	}

}
