package com.NestedLoop;
//1
//
//1 2 3
//
//1 2 3 4 5
//
//1 2 3 4 5 6 7
//
//1 2 3 4 5 6 7 8 9
//
//1 2 3 4 5 6 7
//
//1 2 3 4 5
//
//1 2 3
//
//1

public class pattern6 {
  public void pattern (int a)
  {int c=a;
	  for (int i=1; i<=a; i++)
	  {   if (i%2!=0) {
		  for (int j=1; j<=i; j++)
		  
			  System.out.print(" "+j);
		  
	  }
	  System.out.println();
	  }
	  int e=c-1;
	  for (int b=e; b>=1; b--)
	  {   
		  if (b%2!=0)
		  {  
			  for (int d=1; d<=e; d++)
			  {
				  System.out.print(" "+d);
				  
			  }
		  }
		  e-=1;
		  System.out.println();
		
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern6 obj =new pattern6();
		 obj.pattern(13);
	}

}
