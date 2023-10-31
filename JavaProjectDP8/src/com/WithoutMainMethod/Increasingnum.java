package com.WithoutMainMethod;

public class Increasingnum {
   public boolean Increasing(int a)
   {   int digit=a%10;
        a=a/10;
           
   boolean flag=true;
	   while (a>0)
	   {
		   int rem=a%10;
		   if ((digit<rem))
		   flag=false;
		 
		   digit=rem;
		   a=a/10;
	
	   }
	   return flag;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Increasingnum obj =new Increasingnum ();
		boolean res=obj.Increasing(155349);
		if (res)
		   System.out.println("Increasing order");
		else 
			System.out.println("Not Increasing order");
		
		
	}

}
