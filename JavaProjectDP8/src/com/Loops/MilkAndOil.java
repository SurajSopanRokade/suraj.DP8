package com.Loops;
import java.util.Scanner;
public class MilkAndOil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner (System.in);
        int oilL;
        int milkL;
        int sum;
        int milkL1=0;
   	    int oilL1=0;
     for (int i=1; i<=500; i++)
     {
    	 
         System.out.println("Enter milk in liters");
         milkL=sc.nextInt();
         
         System.out.println("Enter Oil in liters");
         oilL=sc.nextInt();
         milkL=milkL1+milkL;
         milkL1=milkL;
         System.out.println("milkL1 = " + milkL1);
         oilL=oilL1+oilL;
         oilL1=oilL;
         sum=milkL+oilL;
         
         if (milkL*40>500)
         {
        	 System.out.println("Total exceeds 500 with " + milkL + " liters milk  " + oilL + " liter oil ");
        	 System.out.println("Price = " + milkL*40);
        	 break;
         }
         else if (oilL*50>500)
         {
        	 System.out.println("Total exceeds 500 with " + milkL + " liters milk  " + oilL + " liter oil ");
        	 System.out.println("Price = " + oilL*50);
        	 break;
         }
         else if ((milkL*40+oilL*50)>=500) 
         {
        	 System.out.println("Total exceeds 500 with " + milkL + " liters milk  " + oilL + " liter oil ");
        	 System.out.println("Price = " + (milkL*40+oilL*50));
        	 break;
         }
       
     }
	}

}
