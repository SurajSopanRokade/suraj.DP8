package Test3;
//4)	Array is a two dimensional array as follows. 
//Arr = {{ 1,2,3,4},{5,6,7,8}}
//Create a new array ArrCopy which should be as follows
//ArrCopy = {{4,3,2,1} , { 8,7,6,5}

public class CopyArray {
	public static void array() {
		int arr[][]= {{1,2,3,4},{5,6,7,8}};
		int arr1[][]= new int[2][4];
		
		for (int i=0; i<arr.length; i++) {
			int temp=3;
			for (int j=0; j<arr[i].length; j++) {
				arr1[i][j]=arr[i][temp--];
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
	}

}
