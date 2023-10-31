package com.WithoutMainMethod;
import java.util.Scanner;
public class Fibon {
   public void series(int a)
   {   int b=0;
       int c=1;
       int d;
       System.out.println(b);
	   System.out.println(c);
	   for (int i=3; i<=a; i++)
	   {
		   
		   d=b+c;
		   System.out.print(d);
		   b=c;
		   c=d;
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner (System.in);
   int num;
   System.out.println("Enter the number");
   num=sc.nextInt();
   Fibon obj= new Fibon();
   obj.series(num);
	}

}
