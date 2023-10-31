package com.NestedLoop;
//* * * *
//*   *
// * *
//  *
// * * 
//*   * 
//* * * * 
import java.util.Scanner;
public class Pattern33 {
  public void pattern(int a)
  {
	  for (int i=0; i<a; i++)
	  {
		  for (int j=0; j<i; j++)
		  {
			  System.out.print(" ");
		  }
		  for (int k=0; k<a-i; k++)
		  {   if (i==0 || k==0 || i+k==a-1  )
			  System.out.print(" "+"*");
		  else
			  System.out.print(" "+" ");
		  }
		  System.out.println();
	  }
	  for (int i=1; i<a; i++)
	  {
		  for (int j=a; j>i; j--)
		  {
			  System.out.print(" ");
		  }
		  for (int k=0; k<=i; k++)
		  {   if (k==0 || i== a-1 || i==k )
			  System.out.print("*"+" ");
		  else
			  System.out.print(" "+" ");
		  }
		  System.out.println();
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		Pattern33 obj = new Pattern33();
		obj.pattern(num);
	}

}
