package com.Loops;
public class Display1To50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
       for (int i=1; i<=50; i++)
       {   if ((i%3==0) && (i%5==0))
		       System.out.println("Think quotient ="+i);
       else if (i%3==0)
    		   System.out.println("Think ="+i);
    	   
       else if (i%5==0)
    		   System.out.println("Quotient ="+i);
    	 
    	   else 
    		   System.out.println("Not Divisible by 5 and 3 ="+i);
    	   
    	   
       }
	}

}
