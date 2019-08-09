package com.nonstatic;

public class P17 {

	{
		System.out.println("from-2");
	}
	public static void main(String[] args) {
		
		System.out.println("from main");
		P17 ob=new P17();
		System.out.println("+++++++++++++");
		P17 ob1=new P17();
		System.out.println("main ends");
	}
	{
		System.out.println("from-1");
	}
}
