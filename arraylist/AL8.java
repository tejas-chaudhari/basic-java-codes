package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AL8 {

	public static void main(String[] args) {
		
		ArrayList ls= new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(false);
		ls.add('a');
		
		Iterator n=ls.iterator();
		while(n.hasNext())
		{
			System.out.println(n.next());
		}
		
	}
}
