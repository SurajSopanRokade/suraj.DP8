package com.Loops;
import java.util.Scanner;
public class checkNumAutomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int num;
System.out.println("Enter num");
num=sc.nextInt();
int original=num;
int revnum=0;
int Snum=0;
int r;

 for (int i=2; i<=2; i++)
 {
	 num=num*num;
 }
 System.out.println(num);
 for (int a=1; a<=2; a++)
 {
	r=num%10;
	num=num/10;
	revnum=revnum*10+r;
 }
	System.out.println(revnum);
	 for (int a=1; a<=2; a++)
	 {
		r=revnum%10;
		revnum=revnum/10;
		Snum=Snum*10+r;
	 }
	 System.out.println(Snum);
	 if (original==Snum)
	 {
		 System.out.println("Automorphic num");
	 }
	 else
	 {
		 System.out.println("not Automorphic num");
	 }
	}
}
