package com.Loops;
import java.util.Scanner;
public class CountNumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner (System.in);
     int num;
     System.out.println("Enter num");
     num=sc.nextInt();
     int count=0;
     int r;
     for (int i=1; i<=10; i++)
     {  r=num%10;
       if (r!=0)
    	count++;
    	num=num/10;
    	
    			
     }
     System.out.println(count);
     
	}

}
