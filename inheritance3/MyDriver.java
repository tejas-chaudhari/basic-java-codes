package com.inheritance3;

public class MyDriver {

	public static void main(String[] args) {
		
//		A ob1=new A();
//		B ob2=new B();
//		C ob3=new C();
		
//		System.out.println(ob1 instanceof A);
//		System.out.println(ob1 instanceof B);
//		//System.out.println(ob1 instanceof C);
//		System.out.println(ob2 instanceof A);
//		System.out.println(ob2 instanceof B);
		//System.out.println(ob2 instanceof C);
		//System.out.println(ob3 instanceof A);
		//System.out.println(ob3 instanceof B);
		//System.out.println(ob3 instanceof C);
		
		
		//B ob1=(B)new A();
		
		A ob2=new B();//upcasting
		B ob3=(B)ob2;//downcasting
		
		System.out.println(ob2 instanceof A);
		System.out.println(ob2 instanceof B);
		System.out.println(ob3 instanceof A);
		System.out.println(ob3 instanceof B);
		
		
		
		
	}
}
