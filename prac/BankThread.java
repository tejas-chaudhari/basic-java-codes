package com.prac;

public class BankThread {

	double balance = 5000;
	
	public synchronized void WithDraw(int amount)
	{
		if(amount>balance)
		{
		System.out.println("amount is greater than balance");
		System.out.println("waiting for deposit");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {
			balance = balance - amount;
			System.out.println("Balance after withdraw: "+balance);
			System.out.println("amount withdraw");
			}
		}
	public synchronized void Deposit(int amount)
	{
		balance = balance + amount;
		System.out.println("balance after deposit: "+ balance);
		System.out.println("amount deposited");
	}
	
	public static void main(String[] args) {
		
	
		BankThread b1 = new BankThread();
		
		Runnable r1=()->{
		
			b1.WithDraw(8500);
		};
		
		Runnable r2=()->{
			b1.Deposit(5000);
		};
		
		Thread t = new Thread(r1);
		Thread t1 = new Thread(r2);
		
		t.start();
		t1.start();
	}
	
}
