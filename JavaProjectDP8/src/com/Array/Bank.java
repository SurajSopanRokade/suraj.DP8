package com.Array;

public class Bank {
	private String bankname, address, ifscode;
	Account account;

	Bank() {
		account = new Account();
		bankname = "";
		address = "";
		ifscode = "";

	}

	Bank(String bankname, String address, String ifscode, Account acc) {
		this.bankname = bankname;
		this.address = address;
		this.ifscode = ifscode;
		this.account = acc;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setIfsecode(String ifscode) {
		this.ifscode = ifscode;
	}

	public String getBankname() {
		return bankname;
	}

	public String getAddress() {
		return address;
	}

	public String getIfscode() {
		return ifscode;
	}

	public String toString() {
		return " bankname " + bankname + " address " + address + " ifscode " + ifscode + " Account " + account;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank();
		System.out.println(b1);
		Account a1 = new Account("suraj", 12000, 1234);

		Bank b2 = new Bank("SBI", "pune", "SBI0001123", a1);
		System.out.println(b2);
	}

}
