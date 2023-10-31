package com.Loops;
import java.util.Scanner;
public class CI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		                                                              
    double p=4000.0;
    double r=0.1;
    double n=3.0;
    double A=(1+r);
    double a=n;
    double b=n;
    double c=n;
    double d=n;
    
    if (n==2.0)
    	
    {
    	
    
      for (int i=2; i<=2; i++)
    
    	{A=A*(1+r);
    
       A=A*p;
       System.out.println("CI = "+(A-p));
       break;}
    }  
    if (a==3.0)
    {
    	
    
      for (int i=2; i<=3; i++)
    
    	{A=A*(1+r);
       }
       A=A*p;
       System.out.println("CI = "+(A-p));
       
    }  
    else if (b==4.0)
    {
    	
    
      for (int i=2; i<=4; i++)
    
    	{A=A*(1+r);
         }
       A=A*p;
       System.out.println("CI = "+(A-p));
       
	}
    else if (c==5)
    {
    	
    
      for (int i=2; i<=5; i++)
    
    	{A=A*(1+r);
    	}
       A=A*p;
       System.out.println("CI = "+(A-p));
      
	}
    else if (d==6)
    {
    	
    
      for (int i=2; i<=6; i++)
    
    	{A=A*(1+r);
    	}
       A=A*p;
       System.out.println("CI = "+(A-p));
      
	}
    else
    	System.out.println("Not Recognized");
}
}