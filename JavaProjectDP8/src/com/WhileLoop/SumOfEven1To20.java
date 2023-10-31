package com.WhileLoop;

public class SumOfEven1To20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=1;
    int sum=0;
    while (num<=20)
    {   
    	if (num%2==0)
    	
    		sum=sum+num;
    		num++;
    	
    }
    System.out.println(sum);
	}

}
