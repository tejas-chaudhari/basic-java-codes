package com.polymorphism;

public class MianClass2 {
	public static void main(String[] args) {
		
	A ob[]=new A[4];
	ob[0]=new A();
	ob[1]=new B();
	ob[2]=new A();
	ob[3]=new B();
	
	for(int i=0;i<ob.length;i++)
	{
		ob[i].test();
		if(ob[i] instanceof B)
			((B)ob[i]).test1();//DC
	}
	
}
}