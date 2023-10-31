package com.NestedLoop;
//*
//* *
//*   *
//*     *
//*       *
//*         *
//*           *
//*             *
//*               *
//*                 *
//*                   *
//* * * * * * * * * * * *

public class Pattern25 {
    public void Pattern(int a)
    {
    	for (int i=0; i<a; i++)
    	{
    		for (int c=0; c<=a-i; c++)
    		{
    			System.out.print(" ");
    		}
    		for (int b=0; b<=i; b++)
    		{   
    			if ((b==0) || (b==i) || (i==a-1))
    			System.out.print(" "+"*");
    			else 
    			System.out.print(" "+" ");
    			
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern25 obj =new Pattern25();
		obj.Pattern(16);
	}

}
