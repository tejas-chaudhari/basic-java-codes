package com.prac;

import java.util.Scanner;

public class Bank {

	static Scanner sc = new Scanner(System.in);
	double balance;
	
	public void deposit(int amount)
	{
		balance = balance + amount;
		System.out.println("Updated balance is: "+balance);
	}
	
	public void withdraw(int amount)
	{
		if(amount>balance)
		{
			System.out.println("amount is greater than balance");
	        
		}
		else {
			balance = balance- amount;
			System.out.println("updated balance is: "+balance);
		}
	}
	
	public void balance() {
		
		System.out.println("balance is :"+balance);
	}
	
	public void operations() {
		System.out.println("1 for deposit");
		System.out.println("2 for withdraw");
		System.out.println("3 to check balance");
		
		int n = sc.nextInt();
		switch(n)
		{
		
		case 1:
			System.out.println("enter amount to deposit");
			int a= sc.nextInt();
			deposit(a);
			System.out.println("press 1 to continue ?");
			if(sc.nextInt()==1)
			{
				operations();
			}
			else {
				System.out.println("invalid choice..Thank you");
			}
			break;
		
		case 2:
			System.out.println("enter amount to withdraw");
			int c=sc.nextInt();
			withdraw(c);
			System.out.println("press 1 to continue ?");
			if(sc.nextInt()==1)
			{
				operations();
			}
			else {
				System.out.println("invalid choice..Thank you");
			}
			break;
			
		case 3:
			balance();
			System.out.println("press 1 to continue ?");
			if(sc.nextInt()==1)
			{
				operations();
			}
			else {
				System.out.println("invalid choice..Thank you");
			}
			break;
			
		default:System.out.println("invalid choice..Thank you");

		}
	}
	
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		System.out.println("set balance");
		try {
			b.balance=sc.nextInt();
		} catch (Exception e) 
		{
			System.out.println("enter valid amount");
			
		}

		b.operations();
		
		
	}
}
