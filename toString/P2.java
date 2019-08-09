package com.toString;

public class P2 extends P1 {

	String l;

	P2(int i, char j, double k, String l) 
	{
		super(i, j, k);
		this.l = l;
	}
	public String toString()
	{
		return super.toString()+ " l:"+l;
	}
	
	public static void main(String[] args) {
		
		P1 ob=new P1(1,'a',10.0);
		System.out.println(ob.toString());
		P2 ob1=new P2(2,'b',20.0,"hi");
		System.out.println(ob1.toString());
	}
	
	
}
