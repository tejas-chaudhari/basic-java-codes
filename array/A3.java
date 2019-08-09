package com.array;

public class A3 {
  
	public static void main(String[] args) {
		int []a=new int [5];
		System.out.println(a[0]);
		
		a[0]=10;
		a[1]=11;
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		for(int i=0;i<a.length;i++)
			
		System.out.println(i+"---->"+a[i]);
	}
}
