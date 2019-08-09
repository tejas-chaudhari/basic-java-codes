package com.Interface;

public class A implements I1,I2 {

	A()
	{
		super();//calls the object class constructor
	}
	@Override
	public void test() {
		System.out.println("test() implemented in A");
	}
	public static void main(String[] args) {
		
		A ob=new A();
		ob.test();
	}

}
