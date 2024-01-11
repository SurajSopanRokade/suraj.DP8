package Test3;

public class Pairs {
	public static void array() {
		int p=0;
		int arr[]= {4,6,5,-10,8,5,20};
		for (int i=0; i<arr.length; i++) {
				int count=0;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==10) { 
					p=j;
					count++;
				}
			}
			if (count!=0) {
				boolean isNotCounted = true;
				
			  for (int k=i-1; k>=0; k--) {
				if(arr[i]+arr[k]==10)
					isNotCounted=false;
			  }
			  if (isNotCounted)
				  System.out.println(arr[i] + " " + arr[p]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
	}

}
