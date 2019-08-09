package com.hashset;

import java.util.HashSet;

public class HS4 {

	public static void main(String[] args) {
		
		HashSet<Student>hs=new HashSet<>();
		hs.add(new Student(1,"tejas"));
		hs.add(new Student(2,"raj"));
		hs.add(new Student(3,"Akash"));
		hs.add(new Student(3,"Akash"));
		
		for(Student s:hs)
		System.out.println(s);
	} 
}
