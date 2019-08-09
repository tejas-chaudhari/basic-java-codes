package com.inheritance1;

public class B1 extends A1{

	static int y=20;
	static {
		System.out.println("from B1");
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main");
		System.out.println(A1.x);
		System.out.println(B1.y);
	}
}
