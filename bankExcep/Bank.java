package com.bankExcep;


public class Bank {

	private int acc_num=123456789;
	private double balance;
	private int pin=2580;
	
	public double withDraw(double amount) {
		if(amount>balance)
		{
			LimitExceedException l = new LimitExceedException();
			throw l;
		}
		else {
			balance=balance-amount;
			return balance;
		}
	}
	public int getAcc_num(int pin) 
	{
		if(this.pin==pin)
		{
		return acc_num;
		}
		IncorrectPinException i = new IncorrectPinException();
		throw i;
		
	}
	
	public double getBalance(int pin)
	{
		if(this.pin==pin)
		{
		return balance;
		}
		IncorrectPinException i = new IncorrectPinException();
		throw i;
	}
	
	public void setBalance(double balance) {
		this.balance = this.balance+balance;
	}
}
