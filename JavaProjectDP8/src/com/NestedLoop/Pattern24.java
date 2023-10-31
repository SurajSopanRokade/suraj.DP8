package com.NestedLoop;
//*
//***
//*****
//*******
//*********
//***********
//*************
//***************
//*****************
//***************
//*************
//***********
//*********
//*******
//*****
//***
//*

public class Pattern24 {
   public void Pattern (int a)
   {
	   for (int i=0; i<a; i++)
	   {
		   for (int k=0; k<a-i; k++)
		   {
			   System.out.print(" ");
		   }
		   for (int j=0; j<=i; j++)
		   {
			   System.out.print("*");
		   }
		   for (int l=0; l<i; l++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
		   
	   }
	  a=a-1; 
	  for (int b=0; b<a; b++)
	  {
		  for (int c=-1; c<=b; c++)
		  {
			  System.out.print(" ");
		  }
		  for (int d=1; d<=a-b; d++)
		  {
			  System.out.print("*");
		  }
		  for (int e=2; e<=a-b; e++)
		  {
			  System.out.print("*");
		  }
		  
		  System.out.println();
	  }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern24 obj =new Pattern24();
		obj.Pattern(14);
		
	}

}
