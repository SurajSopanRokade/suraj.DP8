package com.Loops;
import java.util.Scanner;
public class ChemicalTemp {
  public void chemicaltemp(int t)
  {  int hours=0;
	  	for (int i=100; i>=t; i-=7)
	  	{
	  		hours++;
	  		
	  	}
	  	System.out.println(" Hours need = " + hours);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int temp;
		System.out.println("Enter temperature");
		temp=sc.nextInt();
		ChemicalTemp obj = new ChemicalTemp();
		obj.chemicaltemp(temp);
	}

}
