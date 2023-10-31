package com.WhileLoop;
import java.util.Scanner;
public class SSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc =new Scanner (System.in);
 int num;
 System.out.println("Enter the number");
 num=sc.nextInt();
 int fact=1;
 int sum=0;
 int result=0;
 int a=num;
 
  
 while (a>0)
 { num=a;
  while (num>0)
  {  
	 {fact=fact*num;
	 num--;
  }
  
  }
  a--;
 
  sum=sum+fact;
  fact=1;
 }
  result=result+sum;
System.out.println(sum);
  
  
  
 
 
 
  
	}

}
