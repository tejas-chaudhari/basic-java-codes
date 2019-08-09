package com.wrapper;

public class Parse {

	public static void main(String[] args) {
		
		String s1="100";
		String s2="200";
		
		System.out.println(s1+s2);
		
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		
		System.out.println(i1+i2);
		
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		System.out.println(d1+d2);
	}
}
