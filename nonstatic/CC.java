package com.nonstatic;

public class CC {

	CC(){
		
		System.out.println("from CC");
	}
	
	CC(int a)
	{
		this();
	System.out.println("from CC(int)");	
	}
	
	public static void main(String[] args) {
		CC ob=new CC();
		CC ob1=new CC(10);// constructor chaining for this object
		
	}
}
