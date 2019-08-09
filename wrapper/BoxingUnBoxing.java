package com.wrapper;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		
	 
		int i=50;
		double d=40;
		char c='a';
		
		Integer i1 = new Integer(i);
		Double d1 = new Double(d);
		Character c1 = new Character(c);
		
		System.out.println("BOXING");
		
		System.out.println(i1);
		System.out.println(d1);
		System.out.println(c1);
		
		System.out.println(i1.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(c1.hashCode());
		
		System.out.println("---------------------------------------");
		
		System.out.println("UNBOXING");
		
		int i2 = i1.intValue();
		System.out.println(i2);
		System.out.println(i2+1);
		
		double d2 = d1.doubleValue();
		System.out.println(d2);
		
		char c2 = c1.charValue();
		System.out.println(c2);
	}
}
