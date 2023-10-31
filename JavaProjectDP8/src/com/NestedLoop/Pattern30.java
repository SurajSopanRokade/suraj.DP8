package com.NestedLoop;
import java.util.Scanner;
public class Pattern30 {
   public void pattern (int a)
   {
	   for (int i=0; i<a; i++)
	   {
		   for (int j=0; j<=i; j++)
		   {
			   System.out.print(" ");
		   }
		   for (int k=0; k<a; k++)
		   {
			   if (i==0 || i==a-1 || k==0 || k==a-1)
			   System.out.print(" "+"*");
			   else
			   System.out.print(" "+" ");   
		   }
		   System.out.println();
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		Pattern30 obj = new Pattern30();
		obj.pattern(num);
	}

}
