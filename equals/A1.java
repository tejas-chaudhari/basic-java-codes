package com.equals;

public class A1 {

	int i;
	char j;
	String k;
	
	A1()
	{
		
	}
	
	A1(int i,char j,String k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	
	@Override
	public String toString() {
		return "i=" + i + ", j=" + j + ", k=" + k ;
	}

	
	public boolean equals(Object ob)
	{
		A1 temp=(A1)ob;
		return this.i==temp.i && this.j==temp.j && this.k.equals(temp.k);	
	}
}

