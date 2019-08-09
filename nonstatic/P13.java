package com.nonstatic;

public class P13 {

	int x;
	P13(int x)
	{
		this.x=x;
		System.out.println(this);
	}
	public static void main(String[] args) {
		
		P13 ob=new P13(10);
		System.out.println(ob.x);
		System.out.println("*********");
		P13 ob1=new P13(20);
		System.out.println(ob1.x);
		
	}
}
