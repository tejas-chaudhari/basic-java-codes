package com.typecasting;

public class Narrowing1 {

	public static void main(String[] args) {
	
		double a=68.5;
		char b=(char)a;//narrowing
		double a2=165;
		char b2=(char)a2;//narrowing

		System.out.println(b);
		System.out.println(b2);
	} 
}
