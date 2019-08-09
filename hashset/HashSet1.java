package com.hashset;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add("sheela");
		hs.add(20.0);
		hs.add(null);
		hs.add(new Employee(58));
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.add(50));
		System.out.println(hs.remove("sheela"));
		System.out.println(hs.contains(10));
		hs.clear();
		System.out.println(hs.isEmpty());
	}
}
