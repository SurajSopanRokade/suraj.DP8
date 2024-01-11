package Test3;
//3) Write a java program to remove duplicate elements from an array?[1M]
//
//Array With Duplicates : [4, 3, 2, 4, 9, 2]
//Array Without Duplicates : [4, 3, 2, 9]

import java.util.Arrays;

public class Duplicate {
	public static void array() {
		int arr[]= {4,3,2,5,5,7,8,7,5,7};
		int count=0;
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]='$';
					
				}	
			}
		}
		for (int i=0; i<arr.length; i++) {
			if(arr[i]=='$')
				count++;
		}
		
		int arr1[]= new int[(arr.length)-(count)];
		int a=0, b=0;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[a]!='$') {
				arr1[b]=arr[a];
				b++;
			}
			a++;
				
				
		}	
		System.out.print(Arrays.toString(arr1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
	}

}
