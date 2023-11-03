package com.arraybasic;
import java.util.Scanner;
//Find sum of all elements of array
public class Sum {
	public static void sumOfArray(int n[]) {
		int sum=0;
		for (int i=0; i<n.length; i++) {
			sum=sum+n[i];
		}
		System.out.println("Sum is " + sum);
	}
	public static int [] createArray() {
		int num[];
		System.out.println("Enter size of array");
		
		Scanner sc  = new Scanner(System.in);
		int size = sc.nextInt();
		num= new int [size];
		for (int i=0; i<num.length; i++) {
			System.out.println("Please enter " +(i+1)+ " Element ");
			num[i]=sc.nextInt();
			
			
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]=createArray();
		sumOfArray(k);
	}

}
