package com.stringAssignment;

//27.  Write a Java program to find highest frequency character in a string.
//28.  Write a Java program to find lowest frequency character in a string.
public class MaxInFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SudSarshanaaaarssssss";
		int b = 0;
		int d = 0;
		int max = 0;
		char temp = 'f';
		char temp2 = 'k';
		char ch[] = str.toCharArray();
		int min = ch[0];
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count != 0) {
				boolean NotOccured = true;
				for (int k = i - 1; k >= 0; k--) {
					if (ch[i] == ch[k])
						NotOccured = false;
				}
				if (NotOccured) {
					System.out.println("Chara " + ch[i] + " " + (count + 1));
				
					b = (count + 1);
					d = (count + 1);

					//for (int l = 0; l < strs; l++) {
						if (b > max) {
							max = b;
							temp = ch[i];
						}
					//}
					//for (int l = 0; l < strs; l++) {
						if (d < min) {
							min = d;
							temp2 = ch[i];
						}
					//}

				}

			}

		}
		System.out.println("Charater " + temp + " Max freq " + max);
		System.out.println("Charater " + temp2 + " Min freq " + min);

	}

}
