package com.ops;
import java.util.Scanner;
public class Account {
	String name, branchname, ifsccode;
	long accountNumber, balance, totalamount,addamount,withdrowal;

	public void setData(String n, String branch, String ifs, long accountN, long addAm, long with) {
		name = n;
		branchname = branch;
		ifsccode = ifs;
		accountNumber = accountN;
		addamount=addAm;
		withdrowal=with;
		balance = 10000;
	}

	public void depositeamount() {
		balance = balance + addamount ;
	}

	public void withDrow() {
		totalamount = balance - withdrowal;
	}

	public void display() {
		System.out.println("Customer name = " + name);
		System.out.println("Customer branchname = " + branchname);
		System.out.println("Customer ifsccode = " + ifsccode);
		System.out.println("Customer accountnumber = " + accountNumber);
		System.out.println("Customer After added balance = " + balance);
		System.out.println("Customer depositeamount = " + totalamount);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter addamount = ");
		int addAmount =sc.nextInt();
		System.out.print("Enter Withdrowalamount = ");
		int WithdrowalAmount =sc.nextInt();
		
		Account obj = new Account();
		obj.setData("suraj", "SBI", "sbi012345", 48573l, addAmount, WithdrowalAmount);
		obj.depositeamount();
		obj.withDrow();
		obj.display();
	}

}
