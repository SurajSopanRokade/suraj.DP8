package com.NestedLoop;

public class Loop14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    	for (int i=1; i<=5; i++)
	    	{
	    		for (int j=1; j<=i; j++ )
	    		{  if (i>=3) {
	    			if ((i==j) || ((i+j)>=6) )
	    			System.out.print("*");
	    		else 
	    			System.out.print(" ");
	    		}
	    		}
	    		
	    		System.out.println();
	    	}
		 
	       
		 
		 }
	}

