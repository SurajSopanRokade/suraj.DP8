package com.WithoutMainMethod;
//1,22,333,4444,55555,666666
public class Series3 {
   public void SeriesS (int a)
   {
	   for (int i=1; i<=a; i++)
	   {
		   for (int j=1; j<=i; j++)
		   { 
			   System.out.print(i);
		   }
		   System.out.print(",");
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series3 obj = new Series3 ();
		obj.SeriesS(6);
	}

}
