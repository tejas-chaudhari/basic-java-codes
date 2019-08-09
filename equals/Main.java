package com.equals;

public class Main {

	public static void main(String[] args) {
		
		A1 ob1=new A1(10,'a',"hello");
		A1 ob2=new A1(10,'a',"hello");
		System.out.println(ob2.equals(ob1));
		System.out.println(ob1.equals(ob2));
		A2 ob3=new A2(20,'b',"hi",10.2);
		A2 ob4=new A2(20,'b',"hi",10.2);
		System.out.println(ob3.equals(ob4));
		System.out.println(ob4.equals(ob3));
	}
}
