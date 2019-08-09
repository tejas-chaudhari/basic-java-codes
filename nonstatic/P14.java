package com.nonstatic;

public class P14 {

	P14()
	{
		System.out.println("from P16");
	}
	P14(int x)
	{
		System.out.println("from P16(int)");
	}
	public static void main(String[] args) {
		
		System.out.println("main starts");
		P14 ob=new P14();
		P14 ob1=new P14(10);
		System.out.println("main ends");
	}
}
