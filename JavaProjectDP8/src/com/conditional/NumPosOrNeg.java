package com.conditional;
import java.util.Scanner;
public class NumPosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		if (num<0)
		{
			System.out.println("Number is negative");
		}
		else if (num>0)
		{
			System.out.println("Number is positive");
		}
		else 
		{
			System.out.println("Number is Zero");
		}
		

	}

}
