package com.Array2D;
//4.	WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9},
//		{12, 5,16}, {34, 42, 2}} output is: 12, 5, 2.
public class MinimumIncol {
	public static void printMin() {
		int arr[][]= {{22,31,9},{12,5,16},{3,5,6},{7,8,9}};
		for (int i=0; i<3; i++) {
			int min=arr[0][i];
			for (int j=0; j<4; j++) {
				if(arr[j][i]<min)
					min=arr[j][i];
			}
			System.out.println(" Min " + min);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMin();
	}

}
