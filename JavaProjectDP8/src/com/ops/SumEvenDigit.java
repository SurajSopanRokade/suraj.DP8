package com.ops;
import java.util.Scanner;
public class SumEvenDigit {
   public void sumdigit(int num) 
   {   int sum=0;
	   while (num>0)
	   {
		   int rem= num%10;
		   
		   if (rem%2==0)
			 sum=sum+rem;  
		   num=num/10;
	   }
	   System.out.println(sum);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumEvenDigit obj =new SumEvenDigit();
		
    Scanner sc = new Scanner (System.in);
    int num;
    System.out.println("Enter num");
    num=sc.nextInt();
    obj.sumdigit(num);
    
	}

}
