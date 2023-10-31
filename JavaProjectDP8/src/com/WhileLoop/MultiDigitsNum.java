package com.WhileLoop;
import java.util.Scanner;
public class MultiDigitsNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);
int num;
System.out.println("Enter the number");
num=sc.nextInt();
int digit ;
int multi=1;
  while (num>0)
  {
	  digit=num%10;
	  multi=multi*digit;
	  num=num/10;
	  
  }
  System.out.println("multiplicaltion of digits = " + multi);
	}

}
