package com.WhileLoop;
import java.util.Scanner;
public class SumOfEvenDigitnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc =new Scanner (System.in);
  int num;
  System.out.println("Enter the number");
  num=sc.nextInt();
  
  int sum=0;
  int digit;
   while(num>0)
   {
	   digit=num%10;
	   if (digit%2==0)
	   {
		   sum=sum+digit;
	   }
	   num=num/10;
   }
   System.out.println(sum);
	}

}
