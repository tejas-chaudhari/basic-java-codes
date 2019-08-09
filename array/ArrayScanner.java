package com.array;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array: ");
		int a=sc.nextInt();		
		System.out.println("enter array elements");
		int []b=new int [a];
		for(int c=0;c<a;c++)
		{
			b[c]=sc.nextInt();
		}
		System.out.println("array elements are");
		for(int i=0;i<b.length;i++) 
		System.out.println(b[i]);
	}
}