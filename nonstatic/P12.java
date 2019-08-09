package com.nonstatic;

public class P12 {
	int x;
	
	P12()
	{
		x=10;//intializing values of non static var x during object creation
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		P12 ob=new P12();
		P12 ob1=new P12();
	}

}
