package Test3;
//5)	WAP to print maximum in row wise in 2D array.
//Means e.g. arr[][]{{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.
public class MaxRowwise {
	public static void array() {
		int arr[][]={{22, 31, 9}, {12, 25, 16}};
		for(int i=0; i<arr.length; i++) {
			int max=0; 
			for (int j=0; j<arr[i].length; j++) {
				if(arr[i][j]>max)
					max=arr[i][j];
			}
			System.out.println("Max " +max);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
	}

}
