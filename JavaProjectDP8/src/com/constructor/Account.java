package com.constructor;
  
// 1.Create a class Account with member Variable: long accountNo, String customerName.Make them public.
// 2.In main, create a new object of the Account class and print the member variables value.
// 3.Create default constructor assign new value to all variables. Write SOP I am in default constructor
// 4.In main, create another object of the Account class and print the member variables  value. Note – Since you have defined a (default) constructor, Java does not provide another one.
// 5.Define a constructor which takes all arguments and assigns those values to the member variables. SOP I am in parameterized constructor
// 6.In main, to create another object of the Account class using the constructor with all arguments and print the member variable values.
// 7.In main method, create 2 Account objects with different account numbers and names.Then print the values of all the member variables of both the accounts.
public class Account {
	public long accountNo;
	public String customerName;
	
	public Account()
	{
		System.out.println("I am default constructor");
		accountNo=12;
	    customerName="person";
	}
	public Account(int acc, String n)
	{
		System.out.println("I am parameterized constructor");
		accountNo=acc;
		customerName=n;
	}
	
	public void setData(int accN, String name)
	{
		accountNo=accN;
		customerName=name;
	}
	public void display()
	{
		System.out.println("Account no = "+accountNo);
		System.out.println("customerName = "+customerName);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account obj = new Account(2345,"Sutaj");
		Account obj1 = new Account();
		Account obj2 = new Account();
		//obj.display();
		obj1.setData(3456, "suraj");
		obj1.display();
		obj2.setData(6789, "Abhi");
		obj2.display();
	}

}
