package com.nonstatic;

public class P10 {

	int x;
	void assign(int a)
	{
		System.out.println(this.x);//0
		this.x=a;
		System.out.println(x);//10
	}
	public static void main(String[] args) {
		System.out.println("main begins");
		P10 ob = new P10();
		ob.assign(10);
		System.out.println("main ends");
   }
}
