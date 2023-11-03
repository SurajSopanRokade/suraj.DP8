package com.Array2D;
//5.	WAP to find sum of each row and column of a matrix.
public class SumOfRowCol {
	public static void printArray() {
		
		int arr[][]= {{1,2,3},{5,6,7},{8,9,3}};
		for (int i=0; i<arr.length; i++) {
			int sumR=0;
			for (int j=0; j<arr.length; j++) {
				sumR=sumR+arr[i][j];
			}
			System.out.println("Sum of rows " + sumR);
			
		}
		
			for (int k=0; k<arr.length; k++) {
				int sumC=0;
				for (int l=0; l<arr.length; l++) {
					sumC=sumC+arr[l][k];
				}
			System.out.println("Sum of cols " + sumC);
			}
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray();
	}

}
