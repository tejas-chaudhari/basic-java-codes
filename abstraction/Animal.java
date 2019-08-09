package com.abstraction;

abstract class Animal {
	double height;
	
	Animal()
	{
		
	}
	Animal (double height)
	{
		this.height=height;
	}
	
	abstract void talk();
	
	
}
