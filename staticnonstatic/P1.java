package com.staticnonstatic;

public class P1 {

	static int a=10;
	static void test()
	{
		System.out.println("from test p1");
		System.out.println(a);
	}

public static void main(String[] args) {

	int a=50;
	System.out.println(a);
	P1.a=500;
	System.out.println(P1.a);
	test();
	P1.test();
	System.out.println(P1.a);
	print();
}
  static void print()
  {
	  System.out.println("from print");
	  System.out.println(P1.a);
  }
}

