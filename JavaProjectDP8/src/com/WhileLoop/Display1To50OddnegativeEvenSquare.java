package com.WhileLoop;

public class Display1To50OddnegativeEvenSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=1;
    while (i<=50)
    {
    	if (i%2!=0)
    		System.out.println(i*(-1));
    	else if (i%2==0)
    		System.out.println(i*i);
    	i++;
    }
	}

}
