package com.treeset;

public class P1 implements Comparable<P1>{

	int i;
	
	P1()
	{
		
	}
	P1(int i)
	{
		this.i=i;
	}
	@Override
	public int compareTo(P1 ob) {
		
	return this.i-ob.i;
	}
	@Override
	public String toString() {
		return "i="+i;
	}
	
	
}
