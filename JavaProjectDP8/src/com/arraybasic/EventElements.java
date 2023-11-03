package com.arraybasic;
import java.util.Scanner;
public class EventElements {
	public static void evenNum(int n[]) {
		for (int i=0; i<n.length; i++) {
			if (n[i]%2==0)
				System.out.print(n[i]+" ");
		}
	}
	public static int [] createArray() {
		int num[];
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		num= new int[size];
		for (int i=0; i<num.length; i++) {
			System.out.println("Enter the " +(i+1)+"Element");
			num[i]=sc.nextInt();
		
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]=createArray();
		evenNum(k);
	}

}
