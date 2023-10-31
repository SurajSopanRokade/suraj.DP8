package com.NestedLoop;

public class Pattern18 {
   public void Pattern(int a)
   { 
	   for (int i=0; i<a; i++)
	   {
		   for (int j=0; j<((a-1)-i); j++)
		   {
			   System.out.print(" ");
		   }
		   for (int k=0; k<=i; k++)
		   {
			   System.out.print("*"+" ");
		   }
		   System.out.println();
		   
	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern18 obj =new Pattern18();
		obj.Pattern(10);
	}

}
