package com.conditional;
import java.util.Scanner;
public class MaxNum3Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner (System.in);
      int num1;
      System.out.println("Enter num1");
      num1=sc.nextInt();
      int num2;
      System.out.println("Enter num2");
      num2=sc.nextInt();
      int num3;
      System.out.println("Enter num3");
      num3=sc.nextInt();
      
      if (num1>num3)
      {
    	  if (num1>num2)
    	  System.out.println("num1 is maximum");
    	  else
    	  System.out.println("num2 is maximum ");
      }
      else
      {
    	  if (num3>num2)
    		  System.out.println("num3 is maximum");
    	  else
    		  System.out.println("num2 is maximum");
    	  
      }
	}

}
