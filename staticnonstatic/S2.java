package com.staticnonstatic;

public class S2 {

	static int a=10;
	
	public static void main(String[] args) {
		
		int a=80;
		System.out.println(a);//local variable
		System.out.println(S2.a);//global variable
		System.out.println(Static.x);//static class global variable
	}
}

