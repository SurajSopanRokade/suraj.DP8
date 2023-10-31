package com.conditional;
import java.util.Scanner;
public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Units");
		float unit;
		unit=sc.nextFloat();
		
	    if (unit>=250)
		{
			System.out.println("bill = "+(25+75+120+(unit-250)*1.50));
		}
	    else if (unit>=150)
		{
			System.out.println("Bill = "+(25+75+(unit-150)*1.20));
		}
	    else if (unit>50)
	    {
	    	System.out.println("bill = "+(25+(unit-50)*0.75));
	    }
	    else if (unit<=50) 
		{
			System.out.println(" bill = "+unit*0.50);
		}
		
		
	
		
			

	}

}
