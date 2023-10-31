package com.conditional;
import java.util.Scanner;
public class DaysInM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter month");
   String month=sc.next();
   
   if (month.equals("January"))
   System.out.println("Month days 31");
   else if (month.equals("february"))
   System.out.println("Month days 28");
   else if (month.equals("March"))
   System.out.println("Month days 31");
   else if (month.equals("April"))
   System.out.println("Month days 30");
   else if (month.equals("May"))
   System.out.println("Month days 31");
   else if (month.equals("Jun"))
   System.out.println("Month days 30");
   else if (month.equals("July"))
   System.out.println("Month days 31");
   else if (month.equals("August"))
   System.out.println("Month days 31");
   else if (month.equals("September"))
   System.out.println("Month days 30");
   else if (month.equals("October"))
   System.out.println("Month days 31");
   else if (month.equals("November"))
   System.out.println("Month days 30");
   else if (month.equals("December"))
   System.out.println("Month days 31");
   
   
   
   
   
   
	}

}
