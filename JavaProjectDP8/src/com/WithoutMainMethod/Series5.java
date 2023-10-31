package com.WithoutMainMethod;
//5,9,17,29,45
public class Series5 {
   public void NumbSeries(int a)
   {   int b=5;
   System.out.println(b);
	   for (int i=1; i<=10; i++)
	   {
		  int c=b+(i*4);
		  b=c;
		  System.out.println(c);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series5 obj =new Series5();
		obj.NumbSeries(6);
	}

}
