package com.Array2D;
import java.util.Scanner;
//1.	WAP to accept data in 2D array of 3X4 and accept data.
public class CreatArray {
	public static void creatArray() {
		int[][] arr;
		System.out.println("Please enter rows of Array....");
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		arr=new int [row][];
		for (int i=0; i<arr.length; i++) {
			System.out.println("Please enter column of Array....");
			int col=sc.nextInt();
			arr[i]= new int [col] ;
			for(int j=0; j<col; j++) {
				System.out.println("Please enter the elements");
				int ele=sc.nextInt();
				arr[i][j]=ele;
			}
			
			}
		for (int j=0; j<arr.length; j++) {
			for (int k=0; k<arr[j].length; k++) {
				System.out.print(arr[j][k]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creatArray();
	}

}
