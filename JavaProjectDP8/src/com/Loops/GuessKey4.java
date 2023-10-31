package com.Loops;
import java.util.Scanner;
public class GuessKey4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     for (int i=1; i<=100; i++)
     {
    	Scanner sc=new Scanner (System.in);
    	int num;
    	System.out.println("Enter guess key....");
    	num=sc.nextInt();
    	
    	if (num<4)
    	{
    		System.out.println("Number is smaller than key...");
    		continue;
    	}
    	else if (num>4)
    	{
    		System.out.println("Number is greater than key...");
    		continue;
    	}
    	else if (num==4)
    	{
    		System.out.println("Number is the key...");
    		break;
    	}
     }
	}

}
