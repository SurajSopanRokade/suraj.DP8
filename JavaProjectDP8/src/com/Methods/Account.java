package com.Methods;
//6) Create a class Account containing following methods :
//insert() to insert account data
//display() to display account information
//deposit() to deposit amount
//withdraw() to withdraw amount
//checkbalance() to check balance
//e.g.
//class Account{
//int acc_no;
//String name;
//float amount;

public class Account {
	int acc_no;
	String name;
	float amount, amountD, amountW, checkbalance;
	
	
		public void insert(int acc_no, String name, float amount)
		{
			this.acc_no = acc_no;
			this.name = name;
			this.amount = amount;
		}
		public void deposite(int d)
		{
			amountD=amount+d;
		}
		public void withdraw(int w)
		{
			amountW=amountD-w;
		}
		public void checkbalance()
		{
			System.out.println("Name is = " + name);
			System.out.println("AccNo is = " + acc_no);
			System.out.println("Amount is = " + amount);
			System.out.println("After deposite amount is = " + amountD);
			System.out.println("After withdraw amount is = " + amountW);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account a1 = new  Account();
		 a1.insert(1234, "Suraj", 12000f);
		 a1.deposite(6000);
		 a1.withdraw(2000);
		 a1.checkbalance();
	}

}
