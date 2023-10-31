package com.WhileLoop;

public class CountOddNumbers1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=1;
    int count=0;
    while (num<=10)
    {
    	if (num%2!=0)
    	count++;
    	num++;
    }
    System.out.println("odd numbers between 1 to 10 =" + count);
	}

}
