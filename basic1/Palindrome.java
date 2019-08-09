package com.basic1;

public class Palindrome {

	static boolean pal(int num)
	{
		int i=num;
		int sum=0,rem;
		while(i>0)
		{
			rem=i%10;
			sum=(sum*10)+rem;
			i=i/10;
			
		}
		if(sum==num)
			return true;
		else return false;
	}
	public static void main(String[] args) {
		System.out.println(pal(45654));
	}
}
