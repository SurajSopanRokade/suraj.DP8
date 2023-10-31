package com.NestedLoop;
import java.util.Scanner;
public class Pattern31 {
   public void pattern(int a)
   {
	   for (int i=0; i<a; i++)
	   {
		   for (int j=0; j<a; j++)
		   {
			   System.out.print(" "+"*");
		   }
		   System.out.println();
		
	   }
	   for (int l=0; l<a; l++)
	   {
		   for (int k=0; k<a/2-2; k++)
		   {
			   System.out.print(" "+" ");
		   }
		   for (int n=0; n<a/2-1; n++)
		   {
			   System.out.print(" "+"*");
		   }
		   System.out.println();
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		Pattern31 obj = new Pattern31();
		obj.pattern(num);
	}

}
