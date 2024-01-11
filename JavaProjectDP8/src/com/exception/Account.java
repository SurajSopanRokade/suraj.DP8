package com.exception;

public class Account {
	String acchname;
	int accno;
	int balance=20000;
	int amount;
	long contact;
	
	Account(){
		acchname="";
		accno=0;
		contact=0;
	}
	
	Account(String acchname, int accno, long contact) throws InsufficientBalanceException{
		
		this.acchname=acchname;
		this.accno=accno;
		this.contact=contact;
	}
	public void deposite(int amount) {
		balance=balance+amount;
		System.out.println(balance);
	}
	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount>balance) {
			throw new InsufficientBalanceException(amount);
		}
		balance=balance-amount;
		System.out.println(balance);
	}
	public String toString() {
		return "Account [acchname=" + acchname + ", accno=" + accno + ", balance=" + balance + ", amount=" + amount
				+ ", contact=" + contact + "]";
	}
	
	
	public static void main(String[] args) throws InsufficientBalanceException  {
		// TODO Auto-generated method stub
	
	  Account a1 = new Account("Suraj", 4567, 9475724911l);
	  try {
	  a1.withdraw(5000);
	  }
	  catch(InsufficientBalanceException e) {
		  System.out.println(e);
	  }
	  a1.deposite(74000);

	}
}