package com.Loops;
import java.util.Scanner;
public class MultiOfDigitsOfAnyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc =new Scanner (System.in);
   int num;
   System.out.println("Enter num");
   num=sc.nextInt();
   int r;
   int multi=1;
   for (int i=1; i<=num; i++ )
   {  
	   r=num%10;
	   if (r!=0)
		multi=multi*r;
	   num=num/10;
   }
   System.out.println(multi);
	}

}
