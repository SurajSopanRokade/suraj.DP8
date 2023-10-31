package com.conditional;
import java.util.Scanner;
public class NumToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		if (num==1)
		{
			System.out.println("Word = One");
		}
		else if (num==2)
		{
			System.out.println("Word = Two");
		}
		else if (num==3)
		{
			System.out.println("Word = Three");
		}
		else if (num==4)
		{
			System.out.println("Word = Four");
		}
		else if (num==5)
		{
			System.out.println("Word = Five");
		}
		else
		{
			System.out.println("Number is invalid");
		}

	}

}
