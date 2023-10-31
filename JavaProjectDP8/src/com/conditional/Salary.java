package com.conditional;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salary;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Salary");
		salary=sc.nextInt();
		
		if (salary<=10000)
		{
			System.out.println("Salary = "+(salary+salary*0.2+salary*0.8));
		}
		else if (salary<=20000)
		{
			System.out.println("Salary = "+(10000+((salary-10000)*(0.25+0.9))));
		}
		else if (salary>20000)
		{
			System.out.println("Salary = "+(10000+11500+(salary-20000)*(0.3+0.95)));
		}

	}

}
