package com.arraybasic;

//11.	WAP to display all perfect square number in array.
//Means e.g. arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9.
public class ShowPerfectSq {
	public static void perfect() {
		int arr[] = { 23, 43, 25, 49, 12, 9, 625, 66, 39, 0 };
		int max = arr[0];
		for (int k = 0; k < arr.length; k++) {
			if (max < arr[k])
				max = arr[k];
		}

		for (int i = 0; i < arr.length; i++) {
			int p = 1;
			for (int j = 0; j < max / 2; j++) {
				if (arr[i] == p * p)
					System.out.print(arr[i] + " ");
				p++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perfect();
	}

}
