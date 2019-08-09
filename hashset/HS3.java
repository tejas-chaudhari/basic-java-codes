package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HS3 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet();
		
		hs.add(10);
		hs.add(50);
		hs.add(60);
		
		for(Integer i:hs)
			System.out.println(i);
		
		Iterator <Integer> n=hs.iterator();
		while(n.hasNext())
			System.out.println(n.next());
	} 
	
}
