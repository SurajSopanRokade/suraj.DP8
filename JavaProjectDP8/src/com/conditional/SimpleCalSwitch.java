package com.conditional;
import java.util.Scanner;
public class SimpleCalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int num1;
     System.out.println("Enter num1");
     num1=sc.nextInt();
     int num2;
     System.out.println("Enter num2");
     num2=sc.nextInt();
     char ch;
     System.out.println("Enter Operator");
     ch=sc.next().charAt(0);
     
     switch(ch)
     {
     case '+':System.out.println("Result = "+(num1+num2));
     break;
     case '-':System.out.println("Result = "+(num1-num2));
     break;
     case '*':System.out.println("Result = "+(num1*num2));
     break;
     case '/':System.out.println("Result = "+(num1/num2));
     break;
     
     }
     
     
	}

}
