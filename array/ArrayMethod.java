package com.array;

public class ArrayMethod {

	static void array(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		
		int []a= {10,20,30};
		
		array(a);
	}
}
