package com.WithoutMainMethod;

public class Febo2 {
   public void Series (int a)
   {
	   int b=0;
	   int c=1;
	   System.out.println(b);
       System.out.println(c);
	   for (int i=1; i<=a; i++)
	   {    
		   int d=b+c;
		   if (d%5==0)
		   System.out.println(d);
		   
		   
		   b=c;
		   
			   
		   c=d;
		  
		  
		      
		       
		   
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Febo2 obj =new Febo2();
		obj.Series(50);
	}

}
