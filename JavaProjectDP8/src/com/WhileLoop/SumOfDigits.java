package com.WhileLoop;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner (System.in);
     int num;
     System.out.println("Enter the number");
     num=sc.nextInt();
     int sum=0;
     while (num>0)
     {
    	 int digit=num%10;
    	 sum=sum+digit;
    	 num=num/10;
     }
     System.out.println(sum);
	}

}
