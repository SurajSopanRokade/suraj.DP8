package com.conditional;
import java.util.Scanner;
public class EligibleOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int year;
	  int per;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter passout year");
      year=sc.nextInt();
      System.out.println("Enter per");
      per=sc.nextInt();
      
      
         if ((year>=2021) && (per>65))
    	  System.out.println("Eligible for Interview");
         else
          System.out.println("Not eligible for Interview");
    	  
      
	}

}
