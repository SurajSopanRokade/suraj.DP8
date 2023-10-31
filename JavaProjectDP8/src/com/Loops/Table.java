package com.Loops;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Table;
		Scanner sc=new Scanner (System.in);
		Table=sc.nextInt();
    for (int i=1; i<=10; i++)
    {   
    	System.out.println(Table*i);
    }
	}

}
