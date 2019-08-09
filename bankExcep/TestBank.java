package com.bankExcep;

public class TestBank {
	
	public static void main(String[] args) {
		
		
		Bank b = new Bank();
		b.setBalance(15000);
		System.out.println(b.getBalance(2580));
		b.withDraw(5000);
		System.out.println(b.getBalance(2580));
		System.out.println(b.getAcc_num(2580));
		b.withDraw(570000);
		
		
	}

	}
