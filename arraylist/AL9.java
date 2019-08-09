package com.arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class AL9 {

public static void main(String[] args) {
		
		ArrayList <Integer> ls= new ArrayList <>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		
		Iterator <Integer> n=ls.iterator();
		while(n.hasNext())
		{
			System.out.println(n.next());
		}
		
	}
}
