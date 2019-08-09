package com.prac;

import java.util.Scanner;

public class encap2 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("enter value for id and name");
		int a=sc.nextInt();
		String b=sc.next();
		encap ob=new encap(a,b);
		System.out.println(ob.name);
		System.out.println(ob.get());
		System.out.println("enter value to set as id:");
		int n=sc.nextInt();
		ob.set(n);
		System.out.println(ob.get());
		
		
}
}