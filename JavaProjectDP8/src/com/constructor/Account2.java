package com.constructor;

//From Account class, comment the default constructor with no arguments and try to create an Account object by calling the default constructor. Note – If a non-default (non-parameterized) constructor is present in the source code, Java will not provide a default one. Hence you cannot do Account a = new Account();
public class Account2 {
	
		public long accountNo;
		public String customerName;
		
		public Account2()
		{
			
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
			 Account2 obj = new  Account2();
			 obj.display();
		}		
}
	


