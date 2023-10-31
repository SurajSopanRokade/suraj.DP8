package com.conditional;
import java.util.Scanner;

public class Divisible9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		if (num%9==0)
		{
			System.out.println("Num is Divisible by 9");
		}
		else 
		{
			System.out.println("Num is not Divisible by 9");
		}

	}

}
