package com.equals;

public class B {

	int a;
	
	B()
	{
		
	}
	B(int a)
	{
		this.a=a;
	}
	@Override
	public boolean equals(Object ob)
	{
		B temp=(B)ob;
		return this.a==temp.a;
	}
	
}
