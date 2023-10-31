package com.NestedLoop;

public class pattern17 {
   public void pattern (int a)
   {
	   for (int i=1; i<=a; i++)
	   {  
		   for (int j=1; j<=a; j++)
		   {  if ((i==j || j>=i) || i==1 || j==a)
			   System.out.print(j);
		      else
		       System.out.print(" ");
		   }
		   
		  
		   System.out.println();
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern17 obj =new pattern17();
		obj.pattern(7);
	}

}
