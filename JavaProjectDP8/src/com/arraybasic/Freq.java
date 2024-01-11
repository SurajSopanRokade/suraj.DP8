package com.arraybasic;

public class Freq {
	public static void countDuplicate(int n[]) {
		int b=0;
		for (int i=0; i<n.length; i++) {
			int count=0;
			for (int j=0; j<n.length; j++) {
				if (i!=j && n[i]==n[j]) {
					
					count++;
				}
			}
			
			if(count!=0) {
				boolean isChecked=true;
				for (int k=i-1; k>=0; k--) {
					if(n[i]==n[k])
						isChecked=false;
				}
				if (isChecked) 
					   System.out.println("Duplicate element "+ n[i] +" count "+(count+1));
			}
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,4,3,5,5,5,3,4,2,1,1};
		countDuplicate(arr);
	}

}
