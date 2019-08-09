package com.nonstatic;

public class Constructor {

	Constructor()
	{
		System.out.println("from P13");
	}
	public static void main(String[] args) {
		
		System.out.println("from main");
		Constructor ob=new Constructor();
		
	}
}
