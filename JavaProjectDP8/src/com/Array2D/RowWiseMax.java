package com.Array2D;
//3.	WAP to print maximum in rowwise in 2D array. Means e.g. arr[][] = 		
//{{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.
public class RowWiseMax {
	public static void printMax() {
		int arr[][]= {{22,31,9},{12,25,16}};
		
		for (int i=0; i<2; i++) {
			int max=arr[i][0];
			for (int j=0; j<arr[i].length; j++) {
				if(arr[i][j]>max)
					max=arr[i][j];
				
			}
			System.out.println(" Max " + max);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMax();
	}

}
