package com.staticnonstatic;

public class StaticnonStatic {

	int i=10;
	static int j=20;
	
	static void print()
	{
	    StaticnonStatic ob1=new StaticnonStatic();
		System.out.println("from print");//from static to static
		System.out.println(j);//from static to non static
		System.out.println(StaticnonStatic.j);
	    System.out.println(ob1.i);//from static to non static

	}
	
	void print1()
	{
		System.out.println("from print1");
		System.out.println(i);//from non static to non static
		System.out.println(StaticnonStatic.j);//from non static to static
		System.out.println(j);//from non static to static
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main");
		StaticnonStatic ob=new StaticnonStatic();//object creation
		System.out.println(ob.i);//from static to non static
		ob.print1();//from static to non static
		print();//from static to static
	}
}
