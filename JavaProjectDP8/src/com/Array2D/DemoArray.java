package com.Array2D;
import java.util.Arrays;
import java.util.Scanner;
public class DemoArray {
	public static void createArray() {
		int arr[][]= new int [3][3];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void creatArray1() {
		int arr[][];
		System.out.println("Please enter array rows...");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		arr = new int [rows][];
		for (int i=0; i<arr.length; i++) {
			System.out.println("Please enter array column...");
			int col=sc.nextInt();
			arr[i]= new int [col];
			for (int j=0; j<col; j++) {
				System.out.print("Please enter the element");
				int ele = sc.nextInt();
				arr[i][j]=ele;
				
			}
			
		}
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static void basicDemo3() {
		int n[][]= {{1,2,3,4,5},{5,6,7,8},{8,9},{4,5,6,7}};
		for(int i=0; i<n.length; i++) {
			for (int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		createArray();
//		creatArray1();
		basicDemo3();
	}

}
