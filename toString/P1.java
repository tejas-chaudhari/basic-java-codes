package com.toString;

public class P1 {

	int i;
	char j;
	double k;
	 
	P1()
	{
		
	}
	P1(int i,char j,double k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	public String toString()
	{
		return "i:"+i+" j:"+j+" k:"+k;
	}
}
