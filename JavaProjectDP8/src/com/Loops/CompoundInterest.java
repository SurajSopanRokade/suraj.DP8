package com.Loops;
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner (System.in);
     
     int magicnumber=66;
     
     
     for (int i=1; i<100; i++ )
     {   System.out.println("Please enter the magic number.....");
    	 magicnumber=sc.nextInt();
    	 if (magicnumber<66)
    	 { System.out.println("Less than magicnumber pls try again....");
    	 continue;}
    	 else if (magicnumber>66)
    	 { System.out.println("Greater than magicnumber pls try again....");
    	 continue;}
    	 else if (magicnumber==66)
    		 System.out.println("It is magicnumber ....");
    	 break;
     }
	}

}
