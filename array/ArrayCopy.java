package com.array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		int []b=new int [5];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
	}
}
