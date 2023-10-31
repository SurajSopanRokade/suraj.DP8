package com.NestedLoop;

public class Pattern21 {
   public void pattern(int a)
   {   char ch;
   
   
	   for (int i=0; i<a; i++)
	   {  ch='A';
		   for (int k=0; k<a-i; k++)
		   {
			   System.out.print(" ");
		   }
		   for (int j=0; j<=i; j++)
		   {
			   System.out.print(ch+++" ");
		   }
		   
		   
		   
		   System.out.println();
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern21 obj =new Pattern21();
		obj.pattern(10);
	}

}
