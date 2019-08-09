package com.array;

import java.util.Scanner;

public class ArrayMethod1 {

	 static void insert(int []ar)
	{
		 Scanner s1=new Scanner(System.in);
		 System.out.println("enter "+ar.length+" elments");
		 for (int i=0;i<ar.length;i++)
		 {
			 ar[i]=s1.nextInt();
		 }
	}
	
	static int [] CreateArray(int x)
	{
		int ar[]=new int[x];
		insert(ar);
		return ar;		
	}
		
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=s.nextInt();
		int []ar= CreateArray(n);
		
		Display(ar);
	}

	static void Display(int []ar) {
		
		System.out.println("array elments are");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(i+"------>"+ar[i]);
		}
	}
	
}
