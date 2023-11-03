package com.arraybasic;
import java.util.Scanner;
//Find average of Array elements
public class Average {
	public static void average(int n[]) {
		int sum=0;
		for (int i=0; i<n.length; i++) {
			sum=sum+n[i];
		}
		int average = sum/n.length;
		System.out.println("Average = " + average);
	}
	public static int[] createArray() {
		//int num[];
		System.out.println("Enter the size of Array");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int [] num= new int[size];
		for (int i=0; i<num.length; i++) {
			System.out.println("Enter the array " +(i+1)+" Elements ");
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]=createArray();
		average(k);
	}

}
