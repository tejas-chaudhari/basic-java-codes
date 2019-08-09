package com.loop;

public class While1to10 {

	public static void main(String[] args) {
		
		int a=1;
		while (a<=10) 
		{
			if(a%3==0)
			{
				a++;
				continue;
			}
			System.out.println(a++);
		}
		
	}
}
