package com.WhileLoop;
import java.util.Scanner;
public class Disarum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner (System.in);
    int num;
    System.out.println("Enter the number");
    num=sc.nextInt();
    int a=num;
    int count=0;
    int rem;
    int sum=0;
    int digit;
    int original=num;
    while (num>0)
    {
    	digit=num%10;
    	count++;
    	num=num/10;
    }
   
    
    while (a>0)
    {
    	rem=a%10;
    	a=a/10;
      if (count==5)
      {
    	 sum=sum+(rem*rem*rem*rem*rem);
      }
      else if (count==4)
      {
     	 sum=sum+(rem*rem*rem*rem);
      }
      else if (count==3)
      {
     	 sum=sum+(rem*rem*rem);
      }
      else if (count==2)
      {
     	 sum=sum+(rem*rem);
      }
      else if (count==1)
      {
     	 sum=sum+(rem);
      }
      
      count--;
      }
    if (original==sum)
    {
    	System.out.println("Disarum number");
    }
    else
    {
    	System.out.println("not Disarum number");
    }
	}
}
