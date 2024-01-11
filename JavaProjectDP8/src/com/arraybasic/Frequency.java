package com.arraybasic;

import java.util.Arrays;

public class Frequency {
	public static void frequency() {
		int arr[]= {1,2,2,2,3,4,4,4,4,1,1,6};
		int n=arr.length;
		int count=0;
		for (int i=0; i<n; i++) {
			if(arr[i]=='$')  
				continue;
				count=1;
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='$';
				}
			}
			
			if (count==1)
				System.out.println("Unique "+arr[i]+" ");
			else if (count>1)
				System.out.println("Element " + arr[i] + " Count " + count);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequency();
	}

}
