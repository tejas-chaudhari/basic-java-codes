package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HM1 {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap<>();
		System.out.println(hm.size());//0
		System.out.println(hm.isEmpty());//true
		hm.put(1,"dingi");
		hm.put(3,"dingi");
		hm.put(2,"kalu");
		hm.put("simba",null);
		hm.put(3,"kaali");//replaces 3,kalu
		System.out.println(hm.put(null,"tejas"));//null
		System.out.println(hm);
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("tejas"));
		
		System.out.println("\nVALUES");
		Collection val = hm.values();
		System.out.println(val);
		
		System.out.println("\nVALUES ITERATOR");
		Iterator v=val.iterator();
		while(v.hasNext())
			System.out.println(v.next());
		
		System.out.println("\nVALUES FOR EACH");
		for(Object w:val)
			System.out.println(w);
		
		System.out.println("\nKEYS ITERATOR");
		Set keys = hm.keySet();
		Iterator n=keys.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());}
		
		System.out.println("\nKEYS FOR EACH");
		for(Object m:keys)
			System.out.println(m);
		}
}
