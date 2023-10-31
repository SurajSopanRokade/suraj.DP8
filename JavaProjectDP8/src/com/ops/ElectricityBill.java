package com.ops;

import java.util.Scanner;

public class ElectricityBill {
	long unit, meternum, contactnum;
	double bill;
	String name, email, month, adr;
    
	public void setData(long u, long meterno, long cont, String n, String mail, String mon, String ad) {
		unit = u;
		meternum = meterno;
		contactnum = cont;
		name = n;
		email = mail;
		month = mon;
		adr = ad;
	}

	public void calculatebill() {
		if (unit >= 250) {
			bill = (25 + 75 + 120 + (unit - 250) * 1.50);
		} else if (unit >= 150) {
			bill = (25 + 75 + (unit - 150) * 1.20);
		} else if (unit > 50) {
			bill = (25 + (unit - 50) * 0.75);
		} else if (unit <= 50) {
			bill = unit * 0.50;
		}

	}

	public void display() {
		System.out.println("Enter meternum = " + meternum);
		System.out.println("Enter name = " + name);
		System.out.println("Enter contactnum = " + contactnum);
		System.out.println("Enter email = " + email);
		System.out.println("Enter month = " + month);
		System.out.println("Enter address = " + adr);
		System.out.println("Enter bill = " + bill);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter name = ");
		name=sc.next();
		String month;
		System.out.println("Enter month = ");
		month=sc.next();
		int unit;
		System.out.println("Enter unit = ");
		unit = sc.nextInt();
		ElectricityBill obj = new ElectricityBill();
		obj.setData(unit, 343423443l, 9975924911l, name, "suraj123@gmail.com", month, "pune");
		obj.calculatebill();
		obj.display();
	}

}
