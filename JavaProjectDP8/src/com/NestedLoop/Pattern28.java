package com.NestedLoop;

public class Pattern28 {
   public void pattern(int a)
   {  int count=1;
	   for (int i=1; i<=a; i++)
	   {
		   for (int j=0; j<a-i; j++)
		   {
			   System.out.print(" ");
		   }
		   for (int k=1; k<=i; k++)
		   {
			   System.out.print(" "+count);
		   }
		   count++;
		   System.out.println();
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern28 obj =new Pattern28();
		obj.pattern(9);
	}

}
