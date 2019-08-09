package com.nonstatic;

public class P15 {
    int x;
	static int y;
	P15()
	{
		System.out.println(this);
		x=10;
		y=20;
	}
	public static void main(String[] args) {
		P15 ob=new P15();
		System.out.println(ob);
		System.out.println(ob.x);
		System.out.println(y);
	}
}
