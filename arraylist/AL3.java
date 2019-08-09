package com.arraylist;

import java.util.ArrayList;

public class AL3 {

	public static void main(String[] args) {
		
		ArrayList ls1=new ArrayList();
		
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		System.out.println(ls1);
		
		ArrayList ls2=new ArrayList();
		 
		ls2.add(10);
		ls2.add(20);
		System.out.println(ls2);
		
		ls1.addAll(ls2);
		System.out.println(ls1);
		System.out.println(ls2);
		ls1.retainAll(ls2);
		System.out.println(ls1);
		
		ls1.removeAll(ls2);
		System.out.println(ls1);
		System.out.println(ls2);
		
		
	}
}
