 package com.NestedLoop;

 public class Pattern16 {
	public void pattern (int a)
  {  	
	  	for (int i=1; i<=a; i++)
	  {  int c=1;
		  	for (int j=1; j<=a; j++)
		  {   
			 System.out.print(c++);
		  }
		  	System.out.println();
	  }
		 
	  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern16 obj =new Pattern16();
		obj.pattern(7);
  }
}
