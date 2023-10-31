package com.conditional;
import java.util.*;
public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year;
		year=sc.nextInt();
		
		if ((year%4==0) && (year%100!=0)||(year%400==0))
		System.out.println("Leap Year");
		else
	    System.out.println("Not leap year");
		

	}

}
