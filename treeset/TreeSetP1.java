package com.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetP1 {

	public static void main(String[] args) {
		
		TreeSet <P1>ts=new TreeSet<>();
		ts.add(new P1(20));
		ts.add(new P1(15));
		ts.add(new P1(25));
		ts.add(new P1(3));
		
		System.out.println("TREESET");
		System.out.println(ts);
		
		System.out.println("\nUSING FOR EACH");
		for(P1 n:ts)
			System.out.println(n);
		
		System.out.println("\nUSING ITERATOR");
		Iterator<P1> n=ts.iterator();
		while(n.hasNext())
			System.out.println(n.next());
	}
}
