package com.WhileLoop;
import java.util.Scanner;
public class CountNumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc =new Scanner (System.in);
 int num;
 System.out.println("Enter the number");
 num=sc.nextInt();
 int count=0;
 int rem;
 while (num>0)
	 {
	   rem=num%10;
	   count++;
	   num=num/10;
	 }
 System.out.println(count);
	}

}
