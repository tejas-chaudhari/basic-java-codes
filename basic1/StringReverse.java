package com.basic1;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter string to reverse");
	String m=s.next();
	String line=m;
	String reverse="";
	
	for(int i=line.length()-1;i>=0;i--)
	{
	reverse = reverse+line.charAt(i);
	}
	System.out.println(reverse);
}
}