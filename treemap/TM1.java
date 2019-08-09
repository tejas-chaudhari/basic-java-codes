package com.treemap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TM1 {

	public static void main(String[] args) {
		
		TreeMap tm=new TreeMap();
		tm.put(1,"dinga");
		tm.put(2, "dingi");
		tm.put(3, "kalu");
//	    tm.put("tejas", 4);//ClassCastException
//		tm.put(null, "tejas");//NullPointerException
		System.out.println(tm);
		
		Set keys = tm.keySet();
		for(Object i:keys)
			System.out.println(i);
	}
}
