package com.arraybasic;

import java.util.Arrays;

public class SecondSmallest2 {
	public static void sort(int n[]) {
		int temp;
		for (int i=0 ;i<n.length; i++) {
			for (int j=0; j<n.length; j++) {
				temp=n[i];
				if (n[i]>n[j+1])
				{	
					
					n[i]=n[j+1];
					n[j+1]=temp;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,45,12,78,34};
		sort(arr);
	}

}
