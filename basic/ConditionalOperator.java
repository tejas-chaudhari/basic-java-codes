package com.basic;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a=25;
		int b =15;
		int c=10;
		int max=(a>b)?(a>c?a:b):(b>c?b:c);
		System.out.println(max);
		
//		int max=a>b?a:b;
//		int min=a<b?a:b;
//		System.out.println("maximum number is:"+max);
//		System.out.println("minimum number is:"+min);
		
	}
}
