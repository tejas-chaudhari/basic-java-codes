package com.inheritance2;

public class ABC {

	public static void main(String[] args) {
		A ob=new A();
		System.out.println(ob.i);//10
		//System.out.println(ob.j);//CTE
		//System.out.println(ob.k);//CTE
		
		B ob1=new B();
		System.out.println(ob1.i);//10
		System.out.println(ob1.j);//20
		//System.out.println(ob1.k);//CTE
		
		C ob2=new C();
		System.out.println(ob2.i);//10
		System.out.println(ob2.j);//20
		System.out.println(ob2.k);//30
	}
}
