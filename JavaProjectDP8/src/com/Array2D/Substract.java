package com.Array2D;
//10.	WAP to subtract two matrices.
public class Substract {
	public static void substract() {
		int arr[][]= {{6,7,8,9},{7,8,5,7},{6,7,6,5},{6,6,7,4}};
		int arr1[][]= {{1,2,4,4},{3,2,1,5},{3,3,1,4},{3,2,5,2}};
		int arr2[][]= new int [4][4];
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				arr2[i][j]=arr[i][j]-arr1[i][j];
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		substract();
	}

}
