package com.ops;
public class AccountStatic {
	int accNo, n, p;
	double r,si;
	String name;
	
	public AccountStatic(int acc, int numy, int principle, String nam)
	{
		
	     accNo=acc;
	     n=numy;
	     p=principle;
	    
		 name=nam;
	}
	
  public static float interestrate ;
  static
  { 
	  interestrate=5;
  }
  public static void interest(float rate)
  {
	  interestrate=rate;
  }
  public void calculateInterest()
  {
	  si=n*p*interestrate/100;
  }
  public void display()
  {
	  System.out.println("Account no = " +accNo );
	  System.out.println("Number of years = " +n );
	  System.out.println("principle = " +p );
	  System.out.println("Account no = " +accNo );
	  System.out.println("Name = " +name );
	  System.out.println("Rate = " +interestrate );
	  System.out.println("SI = " +si );
  }
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountStatic  obj = new AccountStatic (2345,2,2000,"suraj");
			obj.interest(5);
			obj.calculateInterest();
			obj.display();
			
	}

}
