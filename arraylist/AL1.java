package com.arraylist;

import java.util.ArrayList;

public class AL1 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		System.out.println(ls.isEmpty());//true
		System.out.println(ls.size());//0
		ls.add(10);
		ls.add(20.0);
		ls.add("rani");
		ls.add(2,"raja");
		System.out.println(ls);
		System.out.println(ls.set(2,"joker"));//raja
		System.out.println(ls);
		System.out.println(ls.remove(2));//joker
		System.out.println(ls);
		System.out.println(ls.contains(10));//true
		System.out.println(ls.get(2));//rani
		System.out.println(ls.indexOf(10));//0
		System.out.println(ls.lastIndexOf(10));//0
		System.out.println(ls.add(null));
		System.out.println(ls.add(10));//true
		System.out.println(ls);
	}
}
