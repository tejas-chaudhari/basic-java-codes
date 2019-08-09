package com.basic1;

public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=0;
		int c=1;
		
		for(int i=0;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			
			System.out.println(a);
		}
	}
}
