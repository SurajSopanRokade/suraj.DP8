package Test3;

import java.util.Arrays;

//6)	Take an array of integers as input. 
//Print the odd number and even number alternate. 
//Remaining numbers  [2M]
//should appear at the last. 
//Ex: I/P=[1,5,9,7,3,6,8,13,2,4] 
//O/P=[6,1,8,5,2,9,4,7,3,13]
public class EvenOdd {
 public static void array() {
		int arr[] = {1,5,9,7,3,6,8,13,2,4};
		int even=0;
		int odd=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0)
				even++;
			else if (arr[i]%2!=0)
				odd++;
		}
		int eve[]= new int[even];
		int od[]=new int[odd];
		int u=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0)
				eve[u++]=arr[i];
		}
		
		int r=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2!=0)
				od[r++]=arr[i];
		}
		int arr1[]=new int[arr.length];
		int a=0,e=0,o=0;
		for (int j=0; j<eve.length; j++) {
			arr1[a++]=eve[e++];
			arr1[a++]=od[o++];
		}
		for (int i=0; i<2; i++) {
			arr1[a++]=od[o++];
		}
		
	
		System.out.println(Arrays.toString(arr1));
		
	
	
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
	}

}
