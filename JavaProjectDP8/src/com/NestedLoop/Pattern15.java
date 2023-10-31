package com.NestedLoop;
import java.util.Scanner;
public class Pattern15 {
   public void pattern (int a)
   {
	   for (int i=1; i<=a; i++ )
	   {   char ch;
	        ch='A';
		   for (int j=1; j<=i; j++)
		   {   if (j<=i)
			   System.out.print(ch++);
		   else 
			   System.out.print("");
		   }
		   System.out.println();
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		Pattern15 obj =new Pattern15();
		obj.pattern(num);
	}

}
