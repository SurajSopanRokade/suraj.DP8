package com.conditional;
import java.util.Scanner;
public class CheckNumDivisible5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc =new Scanner (System.in);
   int num;
   System.out.println("Enter num");
   num=sc.nextInt();
   
   if (num%5==0 && num%11==0)
   System.out.println("Number is Divisible by 5 and 11");
   else 
   {
	   System.out.println("Number is not divisible by 5 and 11");
   }
   
	
   
	}

}
