package com.nonstatic;

public class CountingObjects {

	static int count;
	{
		count++;
	}
	CountingObjects() {
		System.out.println("from CountingObjects");
	}
	CountingObjects(int a){
		System.out.println("from CO(int)");
	}
	public static void main(String[] args) {
		
		CountingObjects ob=new CountingObjects();
		CountingObjects ob1=new CountingObjects();
		System.out.println(new CountingObjects(22));
		new CountingObjects(10);
		System.out.println("number of objects:"+count);
	}
	
}
