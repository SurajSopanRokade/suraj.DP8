package com.NestedLoop;
//*
//***
//*****
//*******
//*********
//***********
//*************
//***************

public class Pattern23 {
   public void Pattern(int a)
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
		   for (int h=0; h<i; h++)
		   {
			   System.out.print("*");
		   }
		   
		   System.out.println();
		   
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Pattern23 obj =new Pattern23();
	   obj.Pattern(8);
	}

}
