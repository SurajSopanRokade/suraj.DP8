package com.arraybasic;

//15.	WAP to merge 2 arrays to 3rd array. 3rd array should not have elements of same value.
public class Merge2Array {
	public static void mergeArray() {
		int a[] = { 1, 3, 4, 5, 6, 7 };
		int b[] = { 2, 3, 4, 6, 1, 5 };
		int c[] = new int[a.length + b.length];
		int y = 0;
		int count = 0;
		int t = 0;
		for (int i = 0; i < a.length; i++) {
			c[y++] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[y++] = b[i];
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					b[j] = '$';
					count++;
				}
			}
		}

		int d[] = new int[c.length - count];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != '$')
				d[t++] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] != '$')
				d[t++] = b[i];
		}

		for (int k = 0; k < d.length; k++) {
			System.out.print(d[k] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeArray();
	}

}
