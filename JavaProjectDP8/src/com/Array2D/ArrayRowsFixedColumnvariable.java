package com.Array2D;
import java.util.Scanner;
//2.	WAP to accept data in 2D array where rows are fixed and columns are variable.
public class ArrayRowsFixedColumnvariable {
	public static void createArray() {
		int n[][]= new int[4][];
		for (int i=0; i<4; i++) {
			System.out.println("Please enter the column of array..");
			Scanner sc = new Scanner(System.in);
			int col=sc.nextInt();
			n[i]=new int[col];
			for (int j=0; j<col; j++) {
				System.out.println("Please enter element of Array..");
				int ele=sc.nextInt();
				n[i][j]=ele;
			}
		}
		for (int k=0; k<4; k++) {
			for (int l=0; l<n[k].length; l++) {
				System.out.print(n[k][l]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createArray();
	}

}
