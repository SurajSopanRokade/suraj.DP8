package com.Array2D;
//6.	WAP to find sum of main diagonal elements of a matrix.
public class SumOfDiagonal {
	public static void sumOfDia() {
		int arr[][]= {{1,2,3},{2,3,4},{5,6,7}};
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (i==j) {
					sum=sum+arr[i][j];
				}
			}
			
		}
		System.out.println("Sum of Diagonal elements " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfDia();
	}

}
