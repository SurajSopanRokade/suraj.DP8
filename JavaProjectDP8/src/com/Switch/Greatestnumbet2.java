package com.Switch;
import java.util.Scanner;
public class Greatestnumbet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner (System.in);
    int num1;
    System.out.println("Enter num1");
    num1=sc.nextInt();
    int num2;
    System.out.println("Enter num2");
    num2=sc.nextInt();
    int a=num1-num2;
    int r=a%10;
    switch (r)
    {
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:System.out.println("num1 is the greatest number");
    break;
    default:System.out.println("num2 is the greatest number");
    
    	
    
    }
    
	}

}
