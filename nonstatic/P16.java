package com.nonstatic;

public class P16 {

	int x;
	int y;
	
	P16()
	{
		
	}
	P16(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		
		P16 ob=new P16();
		System.out.println(ob.x);
		System.out.println(ob.y);
		P16 ob1=new P16(10,20);
		System.out.println(ob1.x);
		System.out.println(ob1.y);
		System.out.println(ob1.x+ob1.y);
	}
}
