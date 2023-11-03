package com.Array2D;

//16.	WAP sort array elements in ascending order.
public class SortArrayAsending {
	public static void asending() {
		int arr[] = { 5, 6, 8, 3, 4, 7, 1 };
		int temp = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int a : arr)
			System.out.print(a + "  ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asending();
	}

}
