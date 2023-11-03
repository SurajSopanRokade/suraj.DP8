package com.arraybasic;

public class Duplicate1 {
	public static void countDuplicate() {
		int num[]= {1,2,3,1,2,5,7,2,3};
		for (int i=0; i<num.length; i++) {
			boolean isDuplicate = false;
			for (int j=i+1; j<num.length; j++) {
				if(num[i]==num[j]) {
					isDuplicate = true;
					break;
					//break out of the inner loop once a duplicate is
				}
			}
			if (isDuplicate) {
				System.out.println(num[i]);
			}
			if(isDuplicate) {
				//check if the number has not been printed as a duplicate before
				boolean isNotprinted = true; 
				for (int k=i-1; k>=0; k--) {
					if(num[i]==num[k]) {
						isNotprinted = false;
						break;
					}
				}
				if (isNotprinted)
					System.out.println(num[i]+" is a duplicate");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDuplicate();
	}

}
