package com.arraybasic;

import java.util.Arrays;

public class SecondSmallest2 {
	public static void sort(int n[]) {
		
		for (int i=0 ;i<n.length; i++) {
			
			for (int j=i+1; j<n.length	; j++) {
				
				if (n[i]>n[j])
				{	
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(n));
		System.out.println("Second max "+ n[n.length-2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,45,12,78,34};
		sort(arr);
	}

}
