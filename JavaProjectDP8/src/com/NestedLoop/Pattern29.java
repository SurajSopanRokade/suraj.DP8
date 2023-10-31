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
//*******************  
public class Pattern29 {
   public void pattern(int a)
   {  
	   for (int i=0; i<a; i++)
	   { 
		   for (int j=a-1; j>i; j--)
		   {
			   System.out.print(" ");
		   }
		   
		   for (int k=-(a-1); k<=i; k++ )
		   {
			   if ((k==i) || (i==a-1) )
				   System.out.print("*");
			  
		   }
		   for (int l=0; l<=i-1; l++)
		   {   
			   System.out.print(" ");
		   }
		   for (int h=0; h<i-1; h++)
		   {
			   System.out.print(" ");
		   }
		   for (int g=0; g<=i; g++)
		   {   if ((g==1) && (i!=a-1))  
			   System.out.print("*");
		   }
		   
		   System.out.println();
	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern29 obj = new Pattern29();
		obj.pattern(7);
	}

}
