package com.NestedLoop;
//1   
//212  
//32123 
//4321234
//32123 
//212  
//1  
public class pattern7 {
  public void pattern(int a)
  {
	  for (int i=1; i<=a; i++)
	  {
		  for (int j=1; j<=a; j++)
		  {
			  if (j==4)
				  System.out.print("1");
			  
			  else if ((j==3 || j==5) && (i>1 && i<7))
				  System.out.print("2");
			
			  else if ((j==2 || j==6) && (i>2 && i<6))
				  System.out.print("3");
			 
			  else if ((j==1 || j==7) && (i>3 && i<5))
				  System.out.print("4");
			  else
				  System.out.print(" ");
			
		  }
		  System.out.println();
		  
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern7 obj =new pattern7();
		obj.pattern(7);
	}

}
