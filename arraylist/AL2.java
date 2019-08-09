package com.arraylist;

import java.util.ArrayList;

public class AL2 {

	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		
		ls.add(10);
		ls.add("A");
		ls.add(false);
		ls.add("hello world");
	    ls.add(new Bike("chetak",50));
	    System.out.println(ls);	
	}
}
