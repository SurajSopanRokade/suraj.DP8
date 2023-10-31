package com.NestedLoop;
import java.util.Scanner;
public class Pattern32 {
   public void pattern(int a)
   {
	   for (int i=0; i<a; i++)
	   {
		   for (int j=0; j<a-i; j++)
		   {
			   System.out.print(" ");
		   }
		   for (int k=0; k<=i; k++)
		   {
			   System.out.print(" "+"*");
		   }
		   System.out.println();
	   }
	   for (int l=0; l<a; l++)
	   {
		   for (int h=0; h<a-2; h++)
		   {
			   System.out.print(" ");
		   }
		   for (int f=2; f<=a/2+1; f++)
		   {
			   System.out.print("*"+" ");
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
	   Pattern32 obj = new Pattern32();
	   obj.pattern(num);
	}

}
