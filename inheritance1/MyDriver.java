package com.inheritance1;

public class MyDriver {

	public static void main(String[] args) {
        
		A2 ob=new A2();
		System.out.println(ob.i);//10
		//System.out.println(ob.j); //CTE
		B2 ob1=new B2();
		System.out.println(ob1.i);//10
		System.out.println(ob1.j);//20
		
	}
}
