package com.Loops;

public class PrimeNumBet400To300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int count=0;
	int i;	
     for (i=400; i>=300; i--)
     {
        for (int a=2; a<=i; a++)
       
        {
        if (i%a==0)
         count=1;
        
        }
     }
    
      if (count==0)
    		System.out.println("prime");
      
     
     
	
    
	}

}
