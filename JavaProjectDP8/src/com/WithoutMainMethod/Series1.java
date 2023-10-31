package com.WithoutMainMethod;
//1,3,7,15,31
public class Series1 {
  public void SeriesNext(int a)
  {
	  
	  int e=0;
	  for (int c=0; c<=a; c++)
	  {      
		  int d=(e*2)+1;
		  System.out.println(d);
		   e=d;
		  
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series1 obj =new Series1();
		obj.SeriesNext(7);
	}

}
