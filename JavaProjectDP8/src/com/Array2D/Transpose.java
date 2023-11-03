package com.Array2D;
//8.	WAP to create transpose of a matrix (transpose is converting rows to columns)
//and print it.
public class Transpose {
	public static void transpose() {
		int arr[][]= {{1,2,3,4},{5,6,7,8},{6,4,2,7},{2,5,8,3}};
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if(i==j)
					System.out.print(arr[i][j]+" ");
				else if(i<j)
					System.out.print(arr[j][i]+" ");
				else if(i>j)
					System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transpose();
	}

}
