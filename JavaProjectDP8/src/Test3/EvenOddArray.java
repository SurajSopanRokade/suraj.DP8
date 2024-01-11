package Test3;

import java.util.Arrays;

//6)	Take an array of integers as input. 
//Print the odd number and even number alternate. 
//Remaining numbers  [2M]
//should appear at the last. 
//Ex: I/P=[1,5,9,7,3,6,8,13,2,4] 
//O/P=[6,1,8,5,2,9,4,7,3,13]
public class EvenOddArray {
	public void array() {
		int arr[]= {1,5,9,7,3,6,8,13,2,4};
		int evec=0;
		int odc=0;
		int max=0;
		int u=0;
		int v=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0)
				evec++;
			else if (arr[i]%2!=0)
				odc++;
		}
		int eve[]= new int[evec];
		int od[]= new int [odc];
		int arr1[]= new int [evec+odc];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0)
				eve[u++]=arr[i];
		}
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2!=0)
				od[v++]=arr[i];
		}
		System.out.println(evec);
		System.out.println(odc);
		if(evec>odc)
			max=evec;
		else
			max=odc;
		int cnt=0;
	
		for (int i=0; i<max; i++) {
			if(i<evec)
				arr1[cnt++]=eve[i];
			if(i<odc)
				arr1[cnt++]=od[i];
		}
		System.out.print(Arrays.toString(arr1));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddArray e1 = new EvenOddArray();
		e1.array();
	}

}
