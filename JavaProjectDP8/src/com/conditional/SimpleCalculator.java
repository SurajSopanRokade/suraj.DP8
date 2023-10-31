package com.conditional;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner sc=new Scanner (System.in);
     int num1;
     System.out.println("Enter num1");
     num1=sc.nextInt();
     int num2;
     System.out.println("Enter num2");
     num2=sc.nextInt();
     System.out.println("Enter Your Choise");
     System.out.println("1.Add \n 2.Sub \n 3.Mult \n 4.Divi "); 
     int choise;
     choise=sc.nextInt();
     
     switch (choise)
     {
     case 1: System.out.println("Addition = "+ (num1+num2));
     break;
     case 2: System.out.println("Substraction = "+ (num1-num2));
     break;
     case 3: System.out.println("Multiplication = "+ (num1*num2));
     break;
     case 4: System.out.println("Division = "+ (num1/num2));
     }
     
	}

}
