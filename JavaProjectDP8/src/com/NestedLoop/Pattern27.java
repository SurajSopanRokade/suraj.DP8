package com.NestedLoop;

public class Pattern27 {
   public void pattern(int a)
   {  
	   int count=1;
	   for (int i=a; i>=0; i--)
	   { 
		   for (int j=0; j<i; j++)
		   {
			   System.out.print("1");
		   }
		   for (int k=1; k<=(a+1)-i; k++)
		   {
			   System.out.print(count);
			   
		   }
		   count++;
		   System.out.println();
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern27 obj =new Pattern27();
		obj.pattern(7);
	}

}
