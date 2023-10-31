package com.WhileLoop;
import java.util.Scanner;
public class WhileDoCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc =new Scanner (System.in);
   int num1;
   System.out.println("Enter num1");
   num1=sc.nextInt();
   int num2;
   System.out.println("Enter num2");
   num2=sc.nextInt();
   char ch;
   do {
	   System.out.println("1.Addition\n2.Substraction\n3.Multi\n4.Division");
	   System.out.println("Enter the choise from menu");
	   int choise=sc.nextInt();
	   
	   switch (choise)
	   {
	   case 1:System.out.println("Addition = "+(num1+num2));
	   break;
	   case 2:System.out.println("Substraction = "+(num1-num2));
	   break;
	   case 3:System.out.println("Multi = "+(num1*num2));
	   break;
	   case 4:System.out.println("Division = "+(num1/num2));
	   break;
	   default:System.out.println("Invalid choise");
	   }
	   System.out.println("Do you want to continue");
   
	   ch=sc.next().charAt(0);
   }
	   while (ch=='y' || ch=='Y');
	   
   
   
   
	}

}
