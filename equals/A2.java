package com.equals;

public class A2 extends A1{

	double l;
	
	A2()
	{
		
	}
	A2(int i,char j,String k,double l)
	{
		super(i,j,k);
		this.l=l;
	}
	
	public boolean equals(Object ob)
	{
		A2 temp=(A2)ob;
		return super.equals(ob) && this.l==temp.l;
	}
	
}
