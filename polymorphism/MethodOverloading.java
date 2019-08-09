package com.polymorphism;

public class MethodOverloading {

	static void add(int i,int j)
	{
//		int add=i+j;
		System.out.println("sum is:"+(i+j));
	}
	
	static void add(int i,int j,int k)
	{
		System.out.println("sum is:"+(i+j+k));
	}
	
	public static void main(String[] args) {
		
		add(8,9);
		add(5,484,6287);
	}
}
