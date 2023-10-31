package com.WhileLoop;

public class Thinkquotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=1;
    while (i<=50)
    {
    	if ((i%3==0) && (i%5==0))
    	{
    		System.out.println("ThinkQuotient = " + i);
    		
    	}
    	else if (i%3==0)
    	{
    		System.out.println("Think = " + i);
    		
    	}
    	else if (i%5==0)
    	{
    		System.out.println("Quotient = " + i);
    		
    	}
    	else
    	{
    		System.out.println("Number is not divisible by 3 and 5 = " + i);
    		
    	}
    	i++;
    	
    }
	}

}
