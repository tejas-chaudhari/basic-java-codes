package com.staticnonstatic;

public class P2 {

	static
	{
		System.out.println("1");
	}
	public static void main(String[] args) {
		System.out.println("from main");
	}
	
	static
	{
		System.out.println("2");
	}
}
