package com.conditional;
import java.util.Scanner;
public class BloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight;
		int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Weight");
    weight=sc.nextInt();
    System.out.println("Enter Age");
    age=sc.nextInt();
    
    if (weight>=50)
      {
    	if (age>=18)
    		System.out.println("Eligible for blood Donation");
    	else
    		System.out.println("Not Eligible for blood Donation");
      }
    else
    	System.out.println("Not eligible for blood donation");
	}

}
