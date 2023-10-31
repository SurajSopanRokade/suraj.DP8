package com.NestedLoop;

public class TableBet1To5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    for (int i=1; i<=10; i++)
    {   
    	for (int j=1; j<=5; j++ )
    	{
    		int Table=i*j;
    		System.out.print(" " + Table + " ");
    	}
    	System.out.println();
    }
	}

}
