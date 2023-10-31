package com.Loops;
import java.util.Scanner;
public class Sseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int num;
		num=sc.nextInt();
		int fact=1;
		int sum=0;

        for (int i=1; i<=(num*8); i++)
     {   
        	fact=fact*i;
      
        		
    
     
        	System.out.println(fact);
     num--;
      
    
          System.out.println();
     }
        
	}

}
