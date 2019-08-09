package com.assignments;

public class Dog extends Animal{

	void sniff()
	{
		System.out.println("dog sniffs");
	}
	
	public static void main(String[] args) {
		
		Dog ob =new Dog();
		ob.talks();
		ob.sniff();
	}
}
