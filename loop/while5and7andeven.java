package com.loop;

public class while5and7andeven {
	public static void main(String[] args) {
		
		int a=100;
		while(a<=200)
		{
			if(a%5==0 && a%7==0){
				a++;
				continue;	
			}
			{
				System.out.println(a++);
			}
		}
		
	}

}
