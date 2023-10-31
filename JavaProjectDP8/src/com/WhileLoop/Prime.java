package com.WhileLoop;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc =new Scanner (System.in);
  int num;
  System.out.println("Enter the number");
  num=sc.nextInt();
  int count=0;
  int i=2;
  while (i<num)
  {
	  if (num%i==0)
		  count=1;
	  break;
  }
  if (count==0)
	  System.out.println("number is prime");
  else
	  System.out.println("number is not prime");
	}

}
