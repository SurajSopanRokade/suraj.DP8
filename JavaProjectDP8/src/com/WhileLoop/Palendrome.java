package com.WhileLoop;
import java.util.Scanner;
public class Palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);
int num;
System.out.println("Enter the number");
num=sc.nextInt();
int rem;
int revnum=0;
int original=num;
while (num>0)
{
	rem=num%10;
	revnum=revnum*10+rem;
	num=num/10;
}
if (original==revnum)

	 System.out.println("number is Palindrome") ;
else

	System.out.println("number is not palindrome");
	}
}
