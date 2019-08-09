package com.arraylist;

import java.util.ArrayList;

public class AL7 {

public static void main(String[] args) {
		
		ArrayList<Boolean> ls=new ArrayList<>();
		ls.add(10==10);
		ls.add(20>10);
		ls.add(10>50);
		
		
		for(Boolean i:ls)
		{
			System.out.println(i);
		}
	}
}
