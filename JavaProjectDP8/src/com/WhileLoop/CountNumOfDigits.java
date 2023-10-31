package com.WhileLoop;
import java.util.Scanner;
public class CountNumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner (System.in);
 int num;
 System.out.println("Enter tne number");
 num=sc.nextInt();
 int digit;
 int count=0;
 while (num!=0)
 {
	digit=num%10;
	count++;
	num=num/10;
	
 }
 System.out.println("Number of digits = " + count);
 
	}

}
