package com.WhileLoop;
import java.util.Scanner;
public class revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner (System.in);
 int num;
 System.out.println("Enter the number");
 num=sc.nextInt();
 int revnum=0;
 
 int digit;
 while (num!=0)
 {
	 digit=num%10;
	 revnum=revnum*10+digit;
	 num=num/10;
 }
 System.out.println(revnum);
	}

}
