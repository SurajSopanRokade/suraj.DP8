package com.NestedLoop;
//*
//* *
//*   *
//*     *
//*       *
//*     * 
//*   * 
//* * 
//* 
import java.util.Scanner;
public class Pattern34 {
  public void pattern(int a)
  {
	  for (int i=1; i<=a; i++)
	  {
		  for (int j=0; j<a-i; j++)
		  {
			  System.out.print(" ");
		  }
		  for (int k=0; k<i; k++)
		  {
			 if (k==0 || k==i-1)
			  System.out.print(" "+"*");
			 else
			  System.out.print(" "+" "); 
		  }
		 
		  System.out.println();
	  }
	  a=a-1;
	  for (int i=a; i>=1; i--)
	  {
		  for (int j=a+1; j>=i; j--)
		  {
			  System.out.print(" ");
		  }
		  for (int k=i; k>=1; k--)
		  {
			  if(k==i || k==1)
			  System.out.print("*"+" ");
			  else
			  System.out.print(" "+" ");
		  }
		  System.out.println();
			  
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		Pattern34 obj = new Pattern34 ();
		obj.pattern(num);
	}

}
