package com.WhileLoop;

public class Primenumber400To300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        int i=400;
        int count=0;
        int b;
        
     while (i>=300)
     {
    	
    	 b=i;
     i--;
     
  
     
     
     
     
     for (int a=2; a<b; a++)
     {
    	 if (b%a==0)
    		 count=1;
    	 
     }
     
     
     if (count==0)
     {
    	 System.out.println("number is prime" + b);
     }
     else
     {
    	 System.out.println("number is not prime" + b);
     }
	} 
	
	}
}
