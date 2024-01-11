package com.arraybasic;
//12.	WAP to print all unique elements in the array.
public class Unique {
	public static void uniqueElement() {
		int arr[]= {2,4,5,5,4,3,6,3,8,3,4,8,9,7};
		
		for (int i=0; i<arr.length; i++) {
			boolean isUnique=true;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) 
					isUnique=false;
						
			}
			if(isUnique) {
				boolean isPrinted=true;
				for (int k=i-1; k>=0; k--) {
					if(arr[i]==arr[k])
						isPrinted=false;
				}
				if(isPrinted)
					System.out.print(arr[i]+" ");
			}
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueElement();
	}

}
