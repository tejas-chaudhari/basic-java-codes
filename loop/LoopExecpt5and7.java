package com.loop;

public class LoopExecpt5and7 {

	public static void main(String[] args) {
		
		for(int i=100;i<=200;i++)
		{
			if(i%5==0 && i%7==0)
			{
				continue;
				
			}
			else {
				System.out.println(i);
			}
		}
			
	}
}
