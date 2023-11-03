package com.arraybasic;
//Print Array in Reverse order
import java.util.Scanner;
public class ReverseArray {
	public static void showElements(int num[]) {
		System.out.println("Array elements are");
		for (int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]+ " ");
			
		}
	}
	public static int [] createArray() {
		int n[];
		System.out.println("Enter size of Array ");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		n= new int[size];
		for (int i=0; i<n.length; i++) {
			System.out.println("Enter " + (i+1) + " Element " );
			n[i]=sc.nextInt();
			
		}
		sc.close();
		return n;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]=createArray();
		showElements(k);
	}

}
