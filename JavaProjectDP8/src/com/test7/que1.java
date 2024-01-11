package com.test7;
//Q4. Find first non-repeating letter in the given string.			[1]
//e.g.  If input string is ‘My Name is Yasmin’, then first non-repeating letter is ‘e’.

public class que1 {
	public void check() {
		String str = "My Name is Yasmin";
		String str1=str.toLowerCase();
		char ch[]=str1.toCharArray();
		for(int i=0; i<ch.length; i++) {
			int count=0;
			for (int j=i+1; j<ch.length; j++) {
				if (ch[i]==ch[j])
					count++;
			}
			if (count==0) {
				System.out.println(ch[i]);
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		que1 q = new que1();
		q.check();
	}

}
