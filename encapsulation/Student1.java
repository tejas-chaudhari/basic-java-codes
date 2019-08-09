package com.encapsulation;

import java.util.Scanner;

public class Student1 {

	String name;
	private int age;
	
	void SetAge(int age)
	{
		if(age>=4 && age<=60) {
			this.age=age;
		}else {
			Scanner sc=new Scanner(System.in);
			System.out.println("invalid age enter again");
			SetAge(sc.nextInt());	
		}
	}
	
	
	int getAge()
	{
		return age;
	}

}
