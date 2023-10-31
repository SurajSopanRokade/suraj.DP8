package com.conditional;
import java.util.Scanner;

public class Divisible9Or3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		if (num%9==0)
		{
			System.out.println("Divisible by 9");
		}
		else if (num%3==0)
		{
		    System.out.println("Divisible by 3");
		   
		}
		else
		{
			System.out.println("Not Divisible by 3 or 9");
		}
		
		

	}

}
