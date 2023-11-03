package com.Array2D;
//7.	WAP to check if a matrix is a Sparse matrix 
//(in which most of the elements are 0). 
//Print “Sparse” if it is Sparse else print “Not sparse”
public class SpraceMatrix {
	public static void checkMatrix() {
		int arr[][]= {{1,2,0,0,0},{0,0,6,4,0},{2,0,0,4,0},{0,0,0,7,0},{0,5,7,8,0}};
		int count=0;
		int total=0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
					total++;
				if(arr[i][j]==0)
					count++;
			}
		}
		if (count>total/2)
			System.out.println("Given array is a Sparse Matrix");
		else
			System.out.println("Given array is not a Sparse Matrix");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkMatrix();
	}

}
