package com.Loops;
import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner (System.in);
  int num;
  System.out.println("Enter num");
  num=sc.nextInt();
  int revnum=0;
  int original=num;
  int r;
  if (num>=9999)
    for (int i=1; i<=5; i++)
    {
	  r=num%10;
	  
	  num=num/10;
	  revnum=revnum*10+r; 
	  if (revnum==0)
		  break;
    
  
    }
  if (num>=999)
	    for (int i=1; i<=4; i++)
	    {
		  r=num%10;
		  
		  num=num/10;
		  revnum=revnum*10+r;
		  if (revnum==0)
			  break;
	    
   
	    }
   if (num>=99)
	    for (int i=1; i<=3; i++)
	    {
		  r=num%10;
		  
		  num=num/10;
		  revnum=revnum*10+r;
		  if (revnum==0)
			  break;
	    
  
	    }
   if (original==revnum)
   {
	   System.out.println("Palindrome");
   }
   else
   {
	   System.out.println("Not palindrome");
   }
	}
  
	

}
