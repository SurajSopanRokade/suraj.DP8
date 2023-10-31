package com.conditional;
import java.util.Scanner;
public class OddOrEvenSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
    Scanner sc=new Scanner(System.in);
    int num;
    int r;
    System.out.println("Enter num");
    num=sc.nextInt();
    r=num%2;
   
    
    
    
    switch(r)
    {
    case 1:System.out.println("Number is odd");
    break;
    case 0:System.out.println("Number is even");
    break;
    
    }
    
	}

}
