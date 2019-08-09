package com.nonstatic;

public class P18 {

	int x;
	P18()
	{
		System.out.println("from P18");
		x=10;
	}
	{
		System.out.println("from 1");
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		P18 ob=new P18();
		System.out.println(ob.x);
	}
	{
		System.out.println("from 2");
	}
}
