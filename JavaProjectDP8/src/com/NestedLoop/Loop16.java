package com.NestedLoop;

public class Loop16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for (int i=1; i<=5; i++)
    {
    	for (int j=1; j<=5; j++)
    	{ 
    	
    		if ((((i+j==4) || (i+j==6) || (i+j==8)) && (i*j!=5)) && (i>=3))
    			System.out.print("*");
    		else 
    			System.out.print(" ");
    	}
    
    	System.out.println();
	}
	}
}
