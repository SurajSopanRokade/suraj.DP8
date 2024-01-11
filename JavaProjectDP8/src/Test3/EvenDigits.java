package Test3;
//Write a java program to find numbers between 100 and 400 (both included)
//where each digit of a number is an even number.  [1M]
public class EvenDigits {
	public static void number() {
		int a=100;
		int b=400;
		for (int i=a; i<=b; i++) {
			int count=0;
			int c=i;
			while (c>0) {
				int rem=c%10;
				if (rem%2==0) {
					
					count++;
				}
				c=c/10;
			}
			if (count==3)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number();
	}

}
