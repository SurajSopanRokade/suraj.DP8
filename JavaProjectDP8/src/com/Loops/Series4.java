package com.Loops;
import java.util.Scanner;
public class Series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.println("Enter n");
		n=sc.nextInt();
		int a=0;
    for (int i=1; i<=n; i++)
    {   a=((a*10)+1);
    	System.out.println(a);
    }
	}

}
