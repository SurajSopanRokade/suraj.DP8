package com.Array;

public class Account {
	private String accholdername;
	private double balance, accno;

	Account() {
		accholdername = "";
		balance = 0;
		accno = 0;
	}

	Account(String name, double balance, double accno) {
		accholdername = name;
		this.balance = balance;
		this.accno = accno;
	}

	public void setData(String name) {
		accholdername = name;
	}

	public void setData1(double balance) {
		this.balance = balance;
	}

	public void setData2(double accno) {
		this.accno = accno;
	}

	public String getData() {
		return accholdername;
	}

	public double getData1() {
		return balance;
	}

	public double getData2() {
		return accno;
	}

	public String toString() {
		return "Account holder name " + accholdername + "balance" + balance + "accno" + accno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		System.out.println(a1);

		Account a2 = new Account("Suraj", 23000, 2345);
		System.out.println(a2);

	}

}
