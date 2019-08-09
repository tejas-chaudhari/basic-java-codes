package com.array;

public class Array5prime {

	static boolean prime(int n)
	{
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {

		int []b=new int [10];
		int count=0;
	    //int count2=0;
		int limit=10;
		for(int i=2;count<limit;i++)
		{
			if(prime(i))
			{
			b[count]=i;			
					count++;
					//count2++;	
			}
		}
		for(int t=0;t<b.length;t++)
		{
			System.out.println(t+"----->"+b[t]);
	}
	}
}