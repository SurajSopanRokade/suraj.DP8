package com.Loops;
import java.util.Scanner;
public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int n;
		System.out.println("Enter n");
		n=sc.nextInt();
     for (int i=1; i<=n; i++)
     {   if (i%2==0)
     {
    
          if ((i/2)%2==0)
    		System.out.println(i*(-1));
          else
           System.out.println(i);
     }
     }
	}

}
