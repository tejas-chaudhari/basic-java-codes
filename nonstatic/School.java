package com.nonstatic;

public class School {

	public static void main(String[] args) {
	
		Student s1=new Student();
		Student s2=new Student();
		
		s1.name="tejas";
		s1.id=1;
		s1.marks=100;
		
		s2.name="akash";
		s2.id=2;
		s2.marks=101;
		
		
		System.out.println(s1);
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.marks);
		System.out.println();
		System.out.println(s2);
		System.out.println(s2.name);
		System.out.println(s2.id);
		System.out.println(s2.marks);
				
	
}
}
