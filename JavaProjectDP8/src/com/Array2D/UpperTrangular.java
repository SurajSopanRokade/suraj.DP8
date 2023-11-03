package com.Array2D;
//1.	WAP to print upper triangular matrix.
public class UpperTrangular {
	public static void uppTrangular() {
		int arr[][]= {{1,2,3,4},{4,5,6,7},{5,6,7,8},{3,5,2,6}};
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if(i==j || i<j)
					System.out.print(arr[i][j]+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uppTrangular();
	}

}
