package com.encapsulation;

import java.util.Scanner;


public class Check {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Student1 ob=new Student1();
		System.out.println("Enter name");
		String m= sc.next();
		
		System.out.println("Enter age");
		int n=sc.nextInt();
		ob.SetAge(n);
		
		System.out.println("Name is: "+m);
		System.out.println("Age is: "+ob.getAge());
	}
}
