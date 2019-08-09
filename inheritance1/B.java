package com.inheritance1;

public class B extends A {

	static int y=1;
	
	public static void main(String[] args) {
		System.out.println(B.x);
		System.out.println(B.y);
		B.x=104;
		System.out.println(B.x);
		
	}
}
