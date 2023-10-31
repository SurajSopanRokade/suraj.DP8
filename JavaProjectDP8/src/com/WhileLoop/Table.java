package com.WhileLoop;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		
    int num;
    System.out.println("Enter the number");
    num=sc.nextInt();
    int i=1;
    while (i<=10)
    {
    	System.out.println(i*num);
    	i++;
    }
	}

}
