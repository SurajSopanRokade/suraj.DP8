package com.ops;

import java.util.Scanner;

public class Product {
	String name, describtion;
	double price, discount, quantity, totalprice, totaldiscount, discountprice;
	int id;
	
	{
		System.out.println("i am in instance block");
		
	}
	static 
	{
		System.out.println("i am in static block");
	}
	public void setData(String n, String desc, double normalprice, double dis, double quant) {
		name = n;
		describtion = desc;
		price = normalprice;
		discount = dis;
		quantity = quant;
	}

	public void totalDiscount() {
		totaldiscount = price * discount * quantity * 0.01;
	}

	public void totalprice() {
		totalprice = price * quantity;
	}

	public void discountprice() {
		discountprice = totalprice - totaldiscount;
	}

	public void display() {
		System.out.println("Product name = " + name);
		System.out.println("Product describtion = " + describtion);
		System.out.println("Product price = " + price);
		System.out.println("Product discount = " + discount);
		System.out.println("Product quantity = " + quantity);
		System.out.println("Product totalDiscount = " + totaldiscount);
		System.out.println("Product totalprice = " + totalprice);
		System.out.println("Product finalprice = " + discountprice);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter name of product = ");
		name = sc.next();
		String describtion;
		System.out.println("Enter describtion of product = ");
		describtion = sc.next();
		double price;
		System.out.println("Enter price of product = ");
		price = sc.nextInt();
		double discount;
		System.out.println("Enter discount on product = ");
		discount = sc.nextInt();
		double quantity;
		System.out.println("Enter quantity of product = ");
		quantity = sc.nextInt();

		Product obj = new Product();
		obj.setData(name, describtion, price, discount, quantity);
		obj.totalDiscount();
		obj.totalprice();
		obj.discountprice();
		obj.display();

	}

}
