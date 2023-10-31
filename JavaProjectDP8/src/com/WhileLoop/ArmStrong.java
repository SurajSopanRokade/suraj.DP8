package com.WhileLoop;
import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc =new Scanner (System.in);
 int num;
 System.out.println("Enter the number");
 num=sc.nextInt();
 int original=num;
 int rem;
 int sum=0;
 while (num>0)
 {
	 rem=num%10;
	 rem=rem*rem*rem;
	 sum=sum+rem;
	 num=num/10;
	 
 }
 if (original==sum)
 
	 System.out.println("Number is ArmStrong");
 else
	 System.out.println("Number is not Armstrong");
	}

}
