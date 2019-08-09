package com.basic;

public class Switch7 {

	public static void main(String[] args) {
		int num = 15;
		int rem;
		rem=num%7;
		
		
		switch (rem) {
		case 1:{
			System.out.println("monday");
			break;
		}
		case 2:{
			System.out.println("tuesday");
			break;
		}
		case 3:{
			System.out.println("wednesday");
			break;
		}
		case 4:{
			System.out.println("thursday");
			break;
			
		}
		

		default:
			break;
		}
	}
}
