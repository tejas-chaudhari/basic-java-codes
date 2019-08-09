package com.arraylist;

import java.util.ArrayList;

public class AL4{

	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add("rita");
		ls.add(false);
		ls.add(20.0);
		System.out.println(ls);
		
		for(int i=0;i<ls.size();i++)
			System.out.println(ls.get(i));
	}
}
