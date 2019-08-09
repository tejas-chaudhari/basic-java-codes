package com.Interface;

public class A1 implements I1{

	public void test()
	{
		System.out.println("test method of I1 implemented in A1");
	}
	public static void main(String[] args) {
		A1 ob=new A1();
		ob.test();
	 
	}
}
