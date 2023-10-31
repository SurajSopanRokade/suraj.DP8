package com.WhileLoop;

public class Display1To50Skip3And9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i=0;
     while (i<=49)
     {   i++;
     
    	 if ((i%3==0) && (i%9==0))
    	 {
    		 continue;}
    	 
    	 else if ((i%3!=0) || (i%9!=0))
    	 {
    	 System.out.println(i);
    	 }
    	 
     }
	}

}
