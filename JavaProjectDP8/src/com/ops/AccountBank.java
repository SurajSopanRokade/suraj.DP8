package com.ops;

public class AccountBank {
   private int accnum;
   private String ownername;
   private double balance;
   
   public void setAccnum(int acc)
   {
	   accnum=acc;
   }
   public void setOwnername(String owner)
   {
	   ownername=owner;
   }
   public void setBalance(double bal)
   {
	   balance=bal;
   }
   public int getAccnum()
   {
	   return accnum;
   }
   public String getOwnername()
   {
	   return ownername;
   }
   public double getBalance()
   {
	   return balance;
   }
   public void setData(int acc, String owner, double bal)
   {
	   accnum=acc;
	   ownername=owner;
	   balance=bal;
	   
   }
   public void display()
   {
	   System.out.println("Account number is = " + accnum);
	   System.out.println("Ownername is = " + ownername);
	   System.out.println("Balance is = " + balance);
	   
   }
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountBank obj = new AccountBank();
		obj.setAccnum(1234);
		obj.setOwnername("suraj");
		obj.setBalance(1200.34);
		obj.display();
		obj.setData(1235, "S", 1200.35);
		obj.display();
		
		
	}

}
