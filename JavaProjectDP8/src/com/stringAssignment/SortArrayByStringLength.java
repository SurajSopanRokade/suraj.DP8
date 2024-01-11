package com.stringAssignment;

import java.util.Arrays;

//write java program sort a given string by word length
public class SortArrayByStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name Is Suraj";
		String str1[] = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			String temp = " ";
			for (int j = 0; j < str1.length; j++) {
				if (str1[i].length() < str1[j].length()) {
					temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
				}

			}

		}
		System.out.print(Arrays.toString(str1));
	}
}