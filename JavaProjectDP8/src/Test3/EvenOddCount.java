package Test3;

public class EvenOddCount {
	public static void array() {
		int arr[]= {1,2,3,4,5,6};
		int even=0;
		int odd=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0)
				even++;
			else if (arr[i]%2!=0)
				odd++;
		}
		System.out.println("Even count " + even);
		System.out.println("Odd count " + odd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
	}

}
