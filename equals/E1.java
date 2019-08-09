package com.equals;

public class E1 {

	public static void main(String[] args) {
		
		B ob1=new B(10);
		B ob2=new B(10);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1.equals(ob2));//false
		System.out.println(ob2.equals(ob1));//true
		
	}
}
