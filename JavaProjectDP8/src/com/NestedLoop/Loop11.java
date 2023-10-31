package com.NestedLoop;

public class Loop11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
    for (int i=1; i<=4; i++)
    {
    	for(int a=1; a<=i; a++ )
    	{   j=1;
    		if (a%2==0)
    		{
    			System.out.print(j=j-1);	
    		}
    		else
    		{
    			System.out.print(j);
    		}
    		
    	}
    	System.out.println();
    }
	}

}
