package com.staticnonstatic;

public class school {

	public static void main(String[] args) {
		Student.name="Tejas";
		Student.id=1;
		Student.marks=100;
		System.out.println("name="+Student.name);
		System.out.println("id="+Student.id);
		System.out.println("marks="+Student.marks);
		
		Student.name="akash";
		Student.id=2;
		Student.marks=90;
		System.out.println("name="+Student.name);
		System.out.println("id="+Student.id);
		System.out.println("marks="+Student.marks);
	}
}
